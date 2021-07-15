# Meteor Challenge (Part 1)

### Tasks:

1. Count the number of Stars
2. Count the number of Meteors
3. If the Meteors are falling perpendicularly to the Ground (Water level), count how many will fall on the Water
4. (optional) Find the phrase that is hidden in the dots in the sky. 
    HINT 1: 177 Characters
    HINT 2: Most of the last tasks’ code can be reused for this one

    Pixel Ref:

    (pure white)    Stars
    (pure red)      Meteors
    (pure blue)     Water
    (pure black)    Ground

### Implementação

Foram utilizadas as bibliotecas File e ImageIO para carregar um arquivo de imagem. Sabendo que uma imagem trata-se de uma matriz de pixels, é possível percorre-la pegando suas dimensões. A varredura foi feita de forma vertical (fixando o eixo x e variando o y a cada iteração), isso ajudará com a tarefa 3. Durante a varredura é possível resolver as tarefas 1 e 2 contando os pixels vermelhos e brancos. Basta pegar o RGB da coordenada e comparar com as cores branca e vermelha (a biblioteca Color e BufferedImage nos ajudam com isso). Já para o exercício 3, usei a variável redFound para auxiliar. Quando um pixel azul é encontrado após um ou mais pixels vermelhos já terem sido encontrados no mesmo eixo (por isso a importância da varredura ter sido feita de forma vertical), significa que esse meteoro cairá na água. Infelizmente, não consegui concluir a tarefa 4. Acredito que a mensagem escondida tenha sido feita com um tipo de técnica escondendo caracteres através de uma pequena alteração do RGB de alguns pixels. Alterando alguns bits seriam possível esconder caracteres utilizando a tabela ASCII sem que a mudança das cores seja perceptível aos olhos. Contudo, mesmo após uma série de tentativas e testes, não fui capaz de chegar no resultado desejado.
