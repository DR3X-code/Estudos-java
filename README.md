# Estudos Java

Repositório de estudo prático de Java Core, organizado por níveis e temas.

## Perfil do projeto

- Foco: fundamentos da linguagem e introdução a POO.
- Estilo: aulas e exercícios curtos em classes separadas.
- Estrutura principal:
  - `src/basico_01`: lógica básica e fluxo de controle.
  - `src/basico_02`: abstração, classe/objeto, composição, encapsulamento, herança e polimorfismo.
  - `src/intermediario_01`: coleções e exceções.
  - `src/intermediario_02`: banco de dados e cache.

## Requisitos

- JDK instalado (recomendado Java 17+).
- IntelliJ IDEA (opcional, recomendado para estudar os exemplos).

Ambiente validado localmente: compilação e execução com `javac 26`.

## Como rodar no IntelliJ

1. Abra a pasta do projeto no IntelliJ.
2. Configure o SDK do projeto para um JDK instalado.
3. Abra uma classe de exemplo, como `src/basico_01/LogicaBasica.java` ou `src/basico_01/FluxoControle.java`.
4. Execute a classe pelo botão de run do IntelliJ.

## Como rodar no terminal

Compile tudo para a pasta `out`:

```zsh
cd "/home/luis-garcia/workspace/github/preply/leandro/Estudos-java"
rm -rf out
mkdir -p out
javac -d out $(find src -name "*.java")
```

Execute exemplos:

```zsh
cd "/home/luis-garcia/workspace/github/preply/leandro/Estudos-java"
java -cp out basico_01.LogicaBasica
java -cp out basico_01.FluxoControle
```

## Observações

- O projeto é didático e pode evoluir com novos pacotes e exercícios.
- Não há framework de build (Maven ou Gradle) configurado neste momento.

