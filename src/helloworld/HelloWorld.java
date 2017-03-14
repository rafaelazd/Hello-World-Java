/**
 * Arquivo: HelloWorld/src/helloworld/HelloWorld.java
 */

package helloworld;

/**
 * Um programa que diz Ola Mundo
 *
 * Instrucoes:
 * Abra o CMD e acesse a pasta HelloWorld, que contem as pastas
 * src (dos fontes) bin (os executaveis) e digite os comandos abaixo:
 *
 * PARA COMPILAR:
 * javac -d bin src\helloworld\HelloWorld.java
 *
 * PARA EXECUTAR:
 * java -cp bin helloworld.HelloWorld
 */
public class HelloWorld {
	public static void main(String[] args) {
		String nome = "Mundo";
		if (args.length > 0) {
			nome = args[0];
		}
		System.out.println("Ola, " + nome);
	}
}
