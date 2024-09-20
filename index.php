<?php


if ($_GET['comando']) {
    $comando = rawurlencode($_GET['comando']);
    $conteudo = file_get_contents("http://localhost:4567/{$comando}");
}


else {
    echo "Bem-vindo ao text adeventure";
    $conteudo = file_get_contents("http://localhost:4567/help");
}


$arrayAssociativo = json_decode($conteudo);

include "template.phtml";