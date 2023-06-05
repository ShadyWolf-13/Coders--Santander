# Curso Coders

## Aula GIT: status, add, diff, commit, rm, log, restore

* `Status`
    <p>Mostra o Status dos arquivos (Files) dentro do repositório (Pasta Git) selecionada.<p>
    <p><i>Comando:</i>    git status 'nome do arquivo'<p>
* `Add`
    <p>Adiciona modificações de um arquivo específico da área de modificações (Changes) para de modificações encenadas (Staged Changes), onde os arquivos estão verificados e prontos para commit.<p>
    <p><i>Comando:</i>    git add 'nome do arquivo'<p>
* `Diff`
    <p>Mostra as diferenças entre o arquivo modificado (Modified) do arquivo não modificado (Unmodified), seja o arquivo originário ou o último commit.<p>
    <p><i>Comando:</i>    git diff 'nome do arquivo'
                git diff --staged 'nome do arquivo' #Caso o arquivo esteja em Staged Changes<p>
* `Commit`
    <p>Salvam o estado atual dos arquivos em Staged Changes no repositório git.<p>
    <p><i>Comando:</i>    git commit -m 'Uma breve mensagem'<p>
* `Rm`
    <p>Usado para remoção de arquivos do repositório git atual.<p>
    <p><i>Comando:</i>    git rm 'nome do arquivo'<p>
* `Log`
    <p>Mostra o histórico de commits do repositório, incluindo as diferenças de arquivos e hash (Checksum) únicos de cada commit.<p>
    <p><i>Comando:</i>    git log 'nome do arquivo'<p>
* `Restore`
    <p>Restaura o arquivo para o estágio prévio da modificação (Unmodified).<p>
    <p><i>Comando:</i>    git restore 'nome do arquivo'
                git restore --staged 'nome do arquivo' #Caso o arquivo esteja em Staged Changes<p>
* `Push`
    <p>Envia as modificações salvas localmente (Commit) para repositório remoto.<p>
    <p><i>Comando: git push</i><p>
* `Pull`
    <p>Carrega no repositório local as modificações realizadas remotamente, modificando os arquivos locais sem checar as diferenças entre arquivos.<p>
    <p><i>Comando: git pull</i><p>
* `Fetch`
    <p>Carrega no repositório local as modificações realizadas remotamente, sem modificar os arquivos, permitindo uma verificação para posterior aceitação das modificações (pull).<p>
    <p><i>Comando: git fetch</i><p>
* `Branch`
    <p>Cria uma ramificação no versionamento do projeto, permitindo trabalhos paralelos entre membros ou equipes diferentes<p>
    <p><i>Comando: git branch "nome da branch"<i><p>
* `Checkout`
    <p>Realiza a substituição da ramificação (Branch) de trabalho na ferramenta de versionamento (Git)<p>
    <p><i>Comando:</i> git checkout "branch"<p>
