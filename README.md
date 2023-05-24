# Curso Coders

## Aula GIT: status, add, diff, commit, rm, log, restore

* Status
    Mostra o Status dos arquivos (Files) dentro do repositório (Pasta Git) selecionada
    Comando:    git status 'nome do arquivo'
* Add
    Adiciona modificações de um arquivo específico da área de modificações (Changes) para de modificações encenadas (Staged Changes), onde os arquivos estão verificados e prontos para commit
    Comando:    git add 'nome do arquivo'
* Diff
    Mostra as diferenças entre o arquivo modificado (Modified) do arquivo não modificado (Unmodified), seja o arquivo originário ou o último commit.
    Comando:    git diff 'nome do arquivo'
                git diff --staged 'nome do arquivo' #Caso o arquivo esteja em Staged Changes
* Commit
    Salvam o estado atual dos arquivos em Staged Changes no repositório git.
    Comando:    git commit -m 'Uma breve mensagem'
* Rm
    Usado para remoção de arquivos do repositório git atual.
    Comando:    git rm 'nome do arquivo'
* Log
    Mostra o histórico de commits do repositório, incluindo as diferenças de arquivos e hash (Checksum) únicos de cada commit.
    Comando:    git log 'nome do arquivo'
* Restore
    Restaura o arquivo para o estágio prévio da modificação (Unmodified).
    Comando:    git restore 'nome do arquivo'
                git restore --staged 'nome do arquivo' #Caso o arquivo esteja em Staged Changes