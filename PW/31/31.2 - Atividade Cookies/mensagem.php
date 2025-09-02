<?php
    $nome = $_COOKIE['nome'] ?? '';
    $cidade = $_COOKIE['cidade'] ?? '';

    if (!empty($nome) && !empty($cidade)) {
        echo "<h2>$nome nasceu em $cidade</h2>";
    } else {
        echo "<h2>Dados não encontrados nos cookies!</h2>";
        echo "<a href='form.html'>Voltar</a>";
    }
?>
