# Revisão POO

- abstração
- encapsulamento
- herança
- polimorfismo

## Classe

- Planta
- Esboço final
- Molde
- Tipo personalizado

> classe = atributos + frear

## Objeto

- materialização da classe
- aplicar algo baseado na classe
- fruto do molde
- variável de um tipo personalizado

```java
public class Carro {
  // atributos (tem...)
  public String marca;
  public String placa;
  public int ano;
  public String modelo;
  public double velocidade;

  // metodos(faz...)
  public void acelerar(double aceleracao) {
    velocidade += aceleracao;
  }

  public void frear() {
    velociddade = 0;
  }
}
```

```java
Carro c1 = new Carro();

System.out.println(c1.placa);

c1.marca = "Renault";
c1.ano = 2022;
c1.modelo = "Kwid";
c1.placa = "ABC1D123";
c1.velocidade = 100;

c1.velocidade = 200;

c1.velocidade = -10;
if (c1.velocidade < 0) {
  // pega apenas valor positivo
  c1.velocidade = Math.abs(c1.velocidade);
}

// Carro c1 = new Carro("Renault", "ABC1D123", 2022, "Kwid");
```

problemas atuais:

- estamos criando de qualquer jeito
- estamos usando de qualquer jeito

## Construtor

toda vez que nao colocamos construtor ja existe o construtor padrao escrito na classe

```java
public class Carro {
  // atributos (tem...)
  public String marca;
  public int ano;
  public String modelo;
  public String placa;
  public double velocidade;

  // construtor padrao (invisivel)
  public Carro() {
    // System.out.println("passou aqui");
  }

  // metodos(faz...)
  public void acelerar(double aceleracao) {
    velocidade += aceleracao;
  }

  public void frear() {
    velociddade = 0;
  }
}
```

aplicando construtor personalizado:

```java
public class Carro {
  // atributos (tem...)
  public String marca;
  public int ano;
  public String modelo;
  public String placa;
  public double velocidade;

  // construtor personalizado
  public Carro() {
  }

  public Carro(String modelo, int ano, String marca) {
      this.modelo = modelo;
      this.ano = ano;
      this.marca = marca;
  }

  public Carro(String modelo, int ano, String marca, String placa) {
      this.modelo = modelo;
      this.ano = ano;
      this.marca = marca;
      this.placa;
  }

  // metodos(faz...)
  public void acelerar(double aceleracao) {
      velocidade += aceleracao;
  }

  public void frear(double desaceleracao) {
      if (desaceleracao > velocidade){
          velocidade = 0;
      } else {
          velocidade -= desaceleracao;
      }
  }

  public void frear() {
      velocidade = 0;
  }
}
```

## sobrecarga

metodos com mesmo nome, mas com entradas diferentes podem coexistir

> contam como assinaturas diferentes

```java
  // metodos(faz...)
  public void acelerar(double aceleracao) {
      velocidade += aceleracao;
  }

  public void frear(double desaceleracao) {
      if (desaceleracao > velocidade){
          velocidade = 0;
      } else {
          velocidade -= desaceleracao;
      }
  }

  public void frear() {
      velocidade = 0;
  }
```

## Encapsulamento

> manter dentro da classe a logica da classe

> é um princípio de design de código que consiste em ocultar as funcionalidades e o funcionamento de um código dentro de unidades menores, como funções e métodos

## Modificadores de acesso

- `private`: apenas dentro da classe
- `protected`: dentro da classe e das classes filhas
- `(default)`: funciona dentro do mesmo pacote
- `public`: aberto a todos os arquivos

## Getters and Setters

```java
public class Pessoa {
  private String nome;
}
```
