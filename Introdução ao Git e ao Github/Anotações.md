## Comandos do Windows

#### cd [caminho]

Navegar entre pastas, entra na pasta do caminho que foi dado ao comando.

> cd / 
> Vai para a raíz

> cd.. 
> Voltar para a pasta anterior da hierarquia

#### dir

Listar diretórios do ambiente atual.

#### mkdir [nome da pasta]

Criar uma pasta.

#### echo
Printa no terminal a mensagem.

##### echo [mensagem] > [nome do arquivo]
criar um arquivo com a mensagem como conteúdo.

#### del
Deleta arquivos.
Não deleta pastas (mas deleta os arquivos dentro da pasta).

#### rmdir
Deleta uma pasta com todos os arquivos dentro.

#### cls
Limpar o terminal (também pode-se usar control + L).

#### mv [nome do arquivo] [pasta de destino]
Move o arquivo para outra pasta. Também pode ser usado para renomear  arquivos.

## Comandos git

#### git init
Iniciar o repositório para começar o versionamento. O repositório é iniciado na pasta atual.

#### git add [nome do arquivo/pasta]
Adiciona o arquivo à área de staging (o arquivo está pronto para um commit).
Coloca o arquivo em "staged".

>  git add *
> Adiciona todas as modificações

#### git commit -m "mensagem"
Envia os arquivos para o repositório local e salva todas as alterações, criando uma versão do repositório. Exibe a mensagem passada quando é visualizado.

#### git status
Mostra o status dos arquivos e pastas no repositório, e quais mudanças foram feitas desde o último commit.

#### git remote add origin [link]
Adicionar um repositório remoto.
Origin é o apelido do repositório, por convenção sempre usamos "origin".

> git remote -v
> Lista os repositórios cadastrados

#### git push origin master
Envia as mudanças para o repositório remoto

#### git pull origin master
Puxa os arquivos do repositório remoto e tenta juntar as mudanças
Se falhar, teremos que editar os arquivos manualmente
Após editar, commitar o arquivo para resolver o conflito

#### git clone [URL]
Baixa todos os arquivos de um repositório remoto e já cria um repositório local