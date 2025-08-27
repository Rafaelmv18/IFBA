<?php
    function campoInformado($campo) {
        return isset($_POST[$campo]);
    }

    function campoNaoVazio($campo) {
        return !empty(trim($_POST[$campo]));
    }

    function somenteNumeros($campo) {
        return is_numeric($_POST[$campo]);
    }

    function emailValido($campo) {
        return filter_var($_POST[$campo], FILTER_VALIDATE_EMAIL) !== false;
    }

    function tamanhoMaximo($campo, $max) {
        return strlen($_POST[$campo]) <= $max;
    }

    function validarCPF($cpf) {
        $cpf = preg_replace('/[^0-9]/', '', $cpf);

        if (strlen($cpf) != 11) {
            return false;
        }

        if (preg_match('/(\d)\1{10}/', $cpf)) {
            return false;
        }

        for ($t = 9; $t < 11; $t++) {
            $d = 0;
            for ($c = 0; $c < $t; $c++) {
                $d += $cpf[$c] * (($t + 1) - $c);
            }
            $d = ((10 * $d) % 11) % 10;
            if ($cpf[$c] != $d) {
                return false;
            }
        }

        return true;
    }

?>
