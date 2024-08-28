create database game;

create table game.cenas (
	id_cena int not null primary key,
	descricao varchar(260)
);

create table game.itens (
	id_item int not null primary key,
	nome varchar(260),
	desricao_positiva varchar(250),
	desricao_negativa varchar(250),
	comndo_correto varchar(255),
	id_cena_atual int,
	id_cena_destino int,
	foreign key (id_cena_atual) references cenas(id_cena)
);

INSERT INTO `cenas` (`id_cena`, `descricao`) VALUES
(1, 'Alison sempre foi apaixonado por atletismo. Desde pequeno, Depois de anos de treinamento intenso e dedicação, ele conseguiu chegar à final dos 400 metros rasos do Campeonato Nacional. Alison está no vestiário preparar-se para a corrida, Vamos checar suas SAPATILHA...'),
(2, 'Nossa Alison está tão tenso que esqueceu de pegar e colocar os PREGOS na sua SAPATILHA, coloque os PREGOS na sua SAPATILHA antes de ir para a câmera de chamada da prova.'),
(3, 'Agora alison está a minutos de sua corrida, só precisa confirma a prova é entrar na câmera de chamada, apresente seu DOCUMENTO para o árbitro da prova'),
(4, 'Alison está entrando na pista sua treinadora CARLA está na arquibancada Alisson pode passar é fala com sua treinadora caso ele queira.. mas não é necessário, Agora já na pista pegue o seu BLOCO de saída ajuste ele para começa a corrida'),
(5, 'Alison ficou em 3 lugar com o tempo de 48 segundos e 28  milésimos (48\'28), tem dois finais kk se você tivesse falado com sua treinadora teria informações valiosas para ganhar, (restart para recomeçar)'),
(6, 'Alison fez oque sua treinadora mandou, seguindo a estratégia dela Alison foi campeão Nacional com a marca de 47 segundos e 69 milésimos (47\'69), restart para recomeçar');


INSERT INTO `itens` (`id_item`, `nome`, `desricao_positiva`, `desricao_negativa`, `comndo_correto`, `id_cena_atual`, `id_cena_destino`, `descricao_item`) VALUES
(1, 'SAPATILHA', 'checando SAPATILHAS....', 'Acho que não é esse o comando certo, tente outro\r\n', 'CHECK SAPATILHAS', 1, 2, 'sapatilha de atletismo, especializada em provas de velocidade com\r\npregos médios'),
(2, 'DOCUMENTO', ' ', 'Acho que não é esse o comando certo, tente outro\r\n', ' ', 3, 4, 'Documento de identidade, sem ele você não e confirmado na prova, Não esqueça dele!!\r\n'),
(3, 'PREGOS', 'colocando pregos na sua sapatilhas\r\n', 'Acho que não é esse o comando certo, tente outro\r\n', ' USE PREGOS WITH SAPATILHA\r\n', 2, 3, 'Documento de identidade, sem ele você não e confirmado na prova, Não esqueça dele!!\r\n'),
(4, 'BLOCO ', 'bloco ajustado começou a final dos 400 metros...', 'Acho que não é esse o comando certo, tente outro', 'USE BLOCO', 4, 5, 'blocos de saida, ajudam a dar uma saida melhor dos atletas na prova de velocidades, ajuste ele da maneira que le fique mais confortavel'),
(5, 'CARLA ', 'CARLA le disse para sair forte é segurar na reta oposta por conta do vento e chegando aos 300 metros usar bastante\r\nos braços\r\n', 'Acho que não é esse o comando certo, tente outro', 'USE CARLA', 4, 6, 'Sua treinadora CARLA, uma jovem treinadora muito talentosa\r\n');
