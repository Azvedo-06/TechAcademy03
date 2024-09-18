<?php


if ($_GET['comando']) {
    $comando = rawurlencode($_GET['comando']);
    $conteudo = file_get_contents("http://localhost:4567/{$comando}");
}
else if($conteudo = " " || $conteudo = null) {
    echo "Comando não encontrado ou invalido..";
}
else {
    $conteudo = file_get_contents("http://localhost:4567/");
}


$arrayAssociativo = json_decode($conteudo);

include "template.phtml";