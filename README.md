# Java / Java POO ☕

- Compilador: Transforma o código fonte em código executável
- A linguagem C foi importante para criar códigos que rodam em múltiplas plataformas.
- C++: O ++ se refere a orientação a objetos

## Funcionamento do Java

- O Java é compilado pelo JavaC (compilador do Java), gera um bytecode que irá poder rodar em qualquer plataforma que tenha JVM (Java Virtual Machine) e rodará em qualquer plataforma.
    - Isso tudo se chama WORA - Write Once Run Anywhere
    - **JRE** - Java Runtime Environment (Ambiente de Tempo de Execução Java)
        - JVM
            - Loader / Verificador
            - Interpretador / Gerenciador
            - Compilador JIT - Just In Time (Compilador em tempo real)
        - Bibliotecas
    - **JDK** - Java Development Kit
        - JRE
        - JavaLang
        - JavaTools
            - JavaC
            - Debugger
            - API’ss
        
     - **Obs:** Edições do JDK
        
        - SE - Standard Edition
            - Quando quer utilizar aplicativos em janelas
        - EE - Enterprise Edition
            - Aplicações como muitos recursos para grandes empresas
        - ME - Micro Edition
            - Aplicação para dispositivos portáteis

## Camel Case

- Primeira letra maiúscula:
    - MinhaClasse - Classe / Interface
- Primeira letra minúscula o restante maiúscula pode ser:
    - meuAtributo
    - minhaVariável
    - meuMétodo
- Todas as letras minúsculas:
    - meu_pacote
- Todas as letras maiúsculas:
    - CONSTANTES

## Tipos Primitivos
![image](https://user-images.githubusercontent.com/78964459/173659794-08b9cbc0-f375-4e08-b0b2-2adf469ef310.png)
---------------------------------------------------------------------------------

## Java POO

### Objeto
- Coisa material ou abstrata que pode ser percebida pelos sentidos e descrita por meio das suas caracteristicas, comportamentos e estado atual.
- Características:
    - Atributos(características)
    - Métodos (comportamentos)
    - Estado

### Instanciar
- Gerar um objeto a partir de uma classe
 ## Estrutura básica OO:
 - Classe
 - Atributo
 - Método
 - Objeto
 - Mensagem
### Classe
- Substantivos
- Nomes significativos
- Contexto deve ser considerado

### Atributo
 - Substantivos e adjetivos
 - Nome significativos
 - Contexto deve ser considerado
 - Abstração
 - Tipos adequados
 - Atributo x Variável 
    - A: O que é próprio e peculiar a alguém ou a alguma coisa.
    - V: Sujeito a variação ou mudanças; que pode variar; inconsistente, instável

## Método
- Define as ações do objeto
- Construtor
    - Cria objetos a partir da classe
- Destrutor
    - Auxilia a destruição de um objeto
- Sobrecarga
    - Muda a assinatura de acordo com a necessidade
        - Assinatura: nome + parâmetros
