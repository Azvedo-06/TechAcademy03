<?php

//declarei aqui fora para ele parar de mandar mensagem de erro, dizendo que não achou a variáwvel
$conteudo;

// isset por que ele não estava encontrando a key 'comando'
if (isset($_GET['comando'])) {
    $comando = rawurlencode($_GET['comando']); 
    $conteudo = file_get_contents("http://localhost:4567/{$comando}");
}
else if($comando = "") {
    echo "digite algum comando";
}
else {
    echo "comando de ajuda";
    $conteudo = file_get_contents("http://localhost:4567/help");
}


$arrayAssociativo = json_decode($conteudo);

include "template.phtml";