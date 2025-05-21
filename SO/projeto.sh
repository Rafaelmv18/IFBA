#!/bin/bash
#Script para gerenciar tarefas automáticas com cron no Debian 12
#Variáveis
LOG_FILE="/var/log/gerenciamento_cron.log"
TEMP_CRON="/tmp/current_crontab"

# Função para exibir ajuda e resumo
mostrar_ajuda() {
    echo "Script para gerenciar tarefas automáticas com cron no Debian 12"
    echo "Equipe: Rafael Venas e Lucas Bueno"
    echo "Este script permite gerenciar tarefas cron, com funções para adicionar, remover e listar tarefas."
}

#Função para instalar o pacote cron
instalar_cron() {
    if ! dpkg -l | grep -q "cron"; then
        echo "Instalando cron"
        sudo apt update -y >> $LOG_FILE 2>&1
        sudo apt install -y cron >> $LOG_FILE 2>&1
        sudo systemctl enable cron
        sudo systemctl start cron
        echo "Cron instalado e ativado com sucesso!"
    else
        echo "Cron já está instalado."
    fi
}

#Função para adicionar tarefa no cron
adicionar_tarefa() {
    echo "Marcacoes do cron"
    echo "* - minutos, * - horas, * - dia, * - mes, * - dia da semana"
    echo "Digite a frequência da tarefa (formato cron: * * * * *):"
    read -r FREQUENCIA

    echo "Digite o comando a ser executado:"
    read -r COMANDO

    # Adiciona a tarefa ao cron
    crontab -l > $TEMP_CRON  # Salva as tarefas existentes
    echo "$FREQUENCIA $COMANDO" >> $TEMP_CRON  # Adiciona a nova tarefa
    crontab $TEMP_CRON  # Atualiza o cron com a nova tarefa
    rm $TEMP_CRON  # Remove o arquivo temporário

    echo "Tarefa adicionada com sucesso!"
    echo "$(date): Nova tarefa adicionada - $FREQUENCIA $COMANDO" >> $LOG_FILE
}

#Função para remover tarefa do cron
remover_tarefa() {
    crontab -l > $TEMP_CRON
    echo "Tarefas agendadas atualmente:"
    cat -n $TEMP_CRON  # Mostra as tarefas numeradas

    echo "Digite o número da tarefa que deseja remover:"
    read -r NUMERO_TAREFA

    sed -i "${NUMERO_TAREFA}d" $TEMP_CRON  # Remove a linha correspondente
    crontab $TEMP_CRON  # Atualiza o cron

    echo "Tarefa removida com sucesso!"
    echo "$(date): Tarefa $NUMERO_TAREFA removida." >> $LOG_FILE
}

#Função para listar as tarefas agendadas no cron
listar_tarefas() {
    echo "Tarefas agendadas atualmente:"
    crontab -l
}

#Função principal de interação com o usuário
menu_principal() {
    echo "Gerenciamento de Tarefas Automáticas com Cron"
    echo "Escolha uma opção:"
    echo "1 - Adicionar tarefa"
    echo "2 - Remover tarefa"
    echo "3 - Listar tarefas agendadas"
    echo "h - Ajuda"
    echo "4 - Sair"
    
    read -r OPCAO

    case $OPCAO in
        1)
            adicionar_tarefa
            ;;
        2)
            remover_tarefa
            ;;
        3)
            listar_tarefas
            ;;
        4)
            echo "Saindo"
            exit 0
            ;;
        *)
            echo "Opção inválida!"
            menu_principal
            ;;
    esac
}

# Verifica se o parâmetro 'h' foi passado e exibe a ajuda
if [[ "$1" == "h" ]]; then
    mostrar_ajuda
    exit 0
fi

#Verifica e instala o cron se necessário
instalar_cron

#Executa o menu principal
while true; do
    menu_principal
done

#Exemplos de codigo
# echo "Teste" >> /tmp/teste.log
# rm -rf /tmp/*