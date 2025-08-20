package actividad_01;

import java.util.Scanner;

public class Ejercicio01 {
	public static void main(Srting[] args) {
		Scanner sc = new Scanner(System.in);
		
// Clase perro
		
		Perro perro1 = new Perro();
		Perro perro2 = new Perro();
		Perro perro3 = new Perro();
		
		System.out.println("Ingrese raza ");
		perro1.raza = sc.next();
		System.out.println("Ingrese peso");
		perro1.peso = sc.nextDouble();
		System.out.println("Ingrese color");
		perro1.color = sc.nextLine();
		
		System.out.println("Raza: " + perro1.raza);
		System.out.println("Color de pelo: " + perro1.color);
		System.out.println("Peso: " + perro1.peso);
		perro1.comer();
		perro1.ladrar();
		perro1.dormir();
		
		System.out.println("Ingrese raza ");
		perro2.raza = sc.next();
		System.out.println("Ingrese peso");
		perro2.peso = sc.nextDouble();
		System.out.println("Ingrese color");
		perro2.color = sc.nextLine();
		
		System.out.println("Raza: " + perro2.raza);
		System.out.println("Color de pelo: " + perro2.color);
		System.out.println("Peso: " + perro2.peso);
		perro2.comer();
		perro2.ladrar();
		perro2.dormir();
		
		System.out.println("Ingrese raza ");
		perro3.raza = sc.next();
		System.out.println("Ingrese peso");
		perro3.peso = sc.nextDouble();
		System.out.println("Ingrese color");
		perro3.color = sc.nextLine();
		
		System.out.println("Raza: " + perro3.raza);
		System.out.println("Color de pelo: " + perro3.color);
		System.out.println("Peso: " + perro3.peso);
		perro3.comer();
		perro3.ladrar();
		perro3.dormir();
		
		// Clase bici
		
		Bicicleta bici1= new Bicicleta();
		Bicicleta bici2= new Bicicleta();
		Bicicleta bici3= new Bicicleta();
		
		System.out.println("Ingrese el modelo de la bici");
		bici1.modelo = sc.next();
		System.out.println("Ingrese el color de la bici");
		bici1.color = sc.next();
		System.out.println("Ingrese el precio de la bici");
		bici1.precio = sc.nextDouble();
		
		System.out.println("\nDatos de la primer bici");
		System.out.println();
		System.out.println("modelo: " + bici1.modelo);
		System.out.println("Color: " + bici1.color);
		System.out.println("Precio: " + bici1.precio);
		bici1.avanzar();
		bici1.brincar();
		bici1.frenar();
		System.out.println("Ingrese el modelo de la bici");
		bici2.modelo = sc.next();
		System.out.println("Ingrese el color de la bici");
		bici2.color = sc.next();
		System.out.println("Ingrese el precio de la bici");
		bici2.precio = sc.nextDouble();
		
		System.out.println("\nDatos de la primer bici");
		System.out.println();
		System.out.println("modelo: " + bici2.modelo);
		System.out.println("Color: " + bici2.color);
		System.out.println("Precio: " + bici2.precio);
		bici2.avanzar();
		bici2.brincar();
		bici2.frenar();
		System.out.println("Ingrese el modelo de la bici");
		bici3.modelo = sc.next();
		System.out.println("Ingrese el color de la bici");
		bici3.color = sc.next();
		System.out.println("Ingrese el precio de la bici");
		bici3.precio = sc.nextDouble();
		
		System.out.println("\nDatos de la primer bici");
		System.out.println();
		System.out.println("modelo: " + bici3.modelo);
		System.out.println("Color: " + bici3.color);
		System.out.println("Precio: " + bici3.precio);
		bici3.avanzar();
		bici3.brincar();
		bici3.frenar();
		
		//Clase Auto
		
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		Auto auto3 = new Auto();
		
		System.out.println("Ingrese el modelo del auto");
		auto1.modelo = sc.next();
		System.out.println("Ingrese la marca del auto");
		auto1.marca = sc.next();
		System.out.println("Ingrese el precio del auto");
		auto1.precio = sc.nextDouble();
		
		System.out.println("\nDatos de la primer auto");
		System.out.println();
		System.out.println("modelo: " + auto1.modelo);
		System.out.println("Color: " + auto1.marca);
		System.out.println("Precio: " + auto1.precio);
		auto1.avanzar();
		auto1.enciende();
		auto1.frenar();
		System.out.println("Ingrese el modelo del auto");
		auto2.modelo = sc.next();
		System.out.println("Ingrese la marca del auto");
		auto2.marca = sc.next();
		System.out.println("Ingrese el precio del auto");
		auto2.precio = sc.nextDouble();
		
		System.out.println("\nDatos de la primer auto");
		System.out.println();
		System.out.println("modelo: " + auto2.modelo);
		System.out.println("Color: " + auto2.marca);
		System.out.println("Precio: " + auto2.precio);
		auto2.avanzar();
		auto2.enciende();
		auto2.frenar();
		System.out.println("Ingrese el modelo del auto");
		auto3.modelo = sc.next();
		System.out.println("Ingrese la marca del auto");
		auto3.marca = sc.next();
		System.out.println("Ingrese el precio del auto");
		auto3.precio = sc.nextDouble();
		
		System.out.println("\nDatos de la primer auto");
		System.out.println();
		System.out.println("modelo: " + auto3.modelo);
		System.out.println("Color: " + auto3.marca);
		System.out.println("Precio: " + auto3.precio);
		auto3.avanzar();
		auto3.enciende();
		auto3.frenar();
		// Clace auto
		Computadora pc1 = new Computadora();
		Computadora pc2 = new Computadora();
		Computadora pc3 = new Computadora();
		
		System.out.println("Ingrese el procesador de la pc");
		pc1.procesador = sc.next();
		System.out.println("Ingrese la ram de la pc");
		pc1.ram = sc.nextInt();
		System.out.println("Ingrese la memoria de la pc");
		pc1.tipoDisco = sc.next();
		
		System.out.println("\nDatos de la primer pc");
		System.out.println();
		System.out.println("procesador: " + pc1.procesador);
		System.out.println("Ram: " + pc1.ram);
		System.out.println("Tipo disco: " + pc1.tipoDisco);
		pc1.prender();
		pc1.apagar();
		pc1.reiniciar();
		System.out.println("Ingrese el procesador de la pc");
		pc2.procesador = sc.next();
		System.out.println("Ingrese la ram de la pc");
		pc2.ram = sc.nextInt();
		System.out.println("Ingrese la memoria de la pc");
		pc2.tipoDisco = sc.next();
		
		System.out.println("\nDatos de la primer pc");
		System.out.println();
		System.out.println("procesador: " + pc2.procesador);
		System.out.println("Ram: " + pc2.ram);
		System.out.println("Tipo disco: " + pc2.tipoDisco);
		pc2.prender();
		pc2.apagar();
		pc2.reiniciar();
		System.out.println("Ingrese el procesador de la pc");
		pc3.procesador = sc.next();
		System.out.println("Ingrese la ram de la pc");
		pc3.ram = sc.nextInt();
		System.out.println("Ingrese la memoria de la pc");
		pc3.tipoDisco = sc.next();
		
		System.out.println("\nDatos de la primer pc");
		System.out.println();
		System.out.println("procesador: " + pc3.procesador);
		System.out.println("Ram: " + pc3.ram);
		System.out.println("Tipo disco: " + pc3.tipoDisco);
		pc3.prender();
		pc3.apagar();
		pc3.reiniciar();
		
		//Clase persona
		persona persona1 = new persona();
		persona persona2 = new persona();
		persona persona3 = new persona();
		
		System.out.println("Ingrese lugar de origen de la persona");
		persona1.raza = sc.next();
		System.out.println("Ingrese la Altura de la persona");
		persona1.altura = sc.nextDouble();
		System.out.println("Ingrese el peso el de la persona");
		persona1.peso = sc.nextDouble();
		
		System.out.println("\nDatos del primer perrito");
		System.out.println();
		System.out.println("Origen: " + persona1.raza);
		System.out.println("Altura: " + persona1.altura);
		System.out.println("Peso: " + persona1.peso);
		persona1.comer();
		persona1.caminar();
		persona1.dormir();
		System.out.println("Ingrese lugar de origen de la persona");
		persona2.raza = sc.next();
		System.out.println("Ingrese la Altura de la persona");
		persona2.altura = sc.nextDouble();
		System.out.println("Ingrese el peso el de la persona");
		persona2.peso = sc.nextDouble();
		
		System.out.println("\nDatos del primer perrito");
		System.out.println();
		System.out.println("Origen: " + persona2.raza);
		System.out.println("Altura: " + persona2.altura);
		System.out.println("Peso: " + persona2.peso);
		persona2.comer();
		persona2.caminar();
		persona2.dormir();
		System.out.println("Ingrese lugar de origen de la persona");
		persona3.raza = sc.next();
		System.out.println("Ingrese la Altura de la persona");
		persona3.altura = sc.nextDouble();
		System.out.println("Ingrese el peso el de la persona");
		persona3.peso = sc.nextDouble();
		
		System.out.println("\nDatos del primer perrito");
		System.out.println();
		System.out.println("Origen: " + persona3.raza);
		System.out.println("Altura: " + persona3.altura);
		System.out.println("Peso: " + persona3.peso);
		persona3.comer();
		persona3.caminar();
		persona3.dormir();
		
		//Clase Libro
		libro libro1 = new libro();
		libro libro2 = new libro();
		libro libro3 = new libro();
		System.out.println("Ingrese el autor del libro");
		libro1.autor = sc.next();
		System.out.println("Ingrese el genero del libro");
		libro1.tipo = sc.next();
		System.out.println("Ingrese el numero de paginas");
		libro1.paginas = sc.nextInt();
		
		System.out.println("\nDatos del primer libro");
		System.out.println();
		System.out.println("Autor: " + libro1.autor);
		System.out.println("Genero: " + libro1.tipo);
		System.out.println("Paginas: " + libro1.paginas);
		libro1.abrir();
		libro1.cambiar();
		libro1.cerraar();
		System.out.println("Ingrese el autor del libro");
		libro2.autor = sc.next();
		System.out.println("Ingrese el genero del libro");
		libro2.tipo = sc.next();
		System.out.println("Ingrese el numero de paginas");
		libro2.paginas = sc.nextInt();
		
		System.out.println("\nDatos del primer libro");
		System.out.println();
		System.out.println("Autor: " + libro2.autor);
		System.out.println("Genero: " + libro2.tipo);
		System.out.println("Paginas: " + libro2.paginas);
		libro2.abrir();
		libro2.cambiar();
		libro2.cerraar();
		System.out.println("Ingrese el autor del libro");
		libro3.autor = sc.next();
		System.out.println("Ingrese el genero del libro");
		libro3.tipo = sc.next();
		System.out.println("Ingrese el numero de paginas");
		libro3.paginas = sc.nextInt();
		
		System.out.println("\nDatos del primer libro");
		System.out.println();
		System.out.println("Autor: " + libro3.autor);
		System.out.println("Genero: " + libro3.tipo);
		System.out.println("Paginas: " + libro3.paginas);
		libro3.abrir();
		libro3.cambiar();
		libro3.cerraar();
// Clase calculadora
		
		Calculadora calculadora1 = new Calculadora();
		Calculadora calculadora2 = new Calculadora();
		Calculadora calculadora3 = new Calculadora();
		
		System.out.println("Ingrese el modelo de la calculadora");
		calculadora1.modelo = sc.next();
		System.out.println("Ingrese el tamanio de la calculadora");
		calculadora1.tamanio = sc.next();
		System.out.println("Ingrese el precio de la calculadora");
		calculadora1.precio = sc.nextDouble();
		
		System.out.println("\nDatos de la primer calculadora");
		System.out.println();
		System.out.println("modelo: " + calculadora1.modelo);
		System.out.println("tamanio: " + calculadora1.tamanio);
		System.out.println("Precio: " + calculadora1.precio);
		calculadora1.sumar();
		calculadora1.restar();
		calculadora1.multiplicar();
		System.out.println("Ingrese el modelo de la calculadora");
		calculadora2.modelo = sc.next();
		System.out.println("Ingrese el tamanio de la calculadora");
		calculadora2.tamanio = sc.next();
		System.out.println("Ingrese el precio de la calculadora");
		calculadora2.precio = sc.nextDouble();
		
		System.out.println("\nDatos de la primer calculadora");
		System.out.println();
		System.out.println("modelo: " + calculadora2.modelo);
		System.out.println("tamanio: " + calculadora2.tamanio);
		System.out.println("Precio: " + calculadora2.precio);
		calculadora2.sumar();
		calculadora2.restar();
		calculadora2.multiplicar();
		System.out.println("Ingrese el modelo de la calculadora");
		calculadora3.modelo = sc.next();
		System.out.println("Ingrese el tamanio de la calculadora");
		calculadora3.tamanio = sc.next();
		System.out.println("Ingrese el precio de la calculadora");
		calculadora3.precio = sc.nextDouble();
		
		System.out.println("\nDatos de la primer calculadora");
		System.out.println();
		System.out.println("modelo: " + calculadora3.modelo);
		System.out.println("tamanio: " + calculadora3.tamanio);
		System.out.println("Precio: " + calculadora3.precio);
		calculadora3.sumar();
		calculadora3.restar();
		calculadora3.multiplicar();
		//Clase Celular
		
		Telefono telefono1 = new Telefono();
		Telefono telefono2 = new Telefono();
		Telefono telefono3 = new Telefono();
		
		System.out.println("Ingrese la marca del telefono");
		telefono1.marca = sc.next();
		System.out.println("Ingrese la gama del telefono");
		telefono1.gama = sc.next();
		System.out.println("Ingrese el precio del telefono");
		telefono1.precio = sc.nextDouble();
		
		System.out.println("\nDatos del primer telefono");
		System.out.println();
		System.out.println("Marca: " + telefono1.marca);
		System.out.println("gama: " + telefono1.gama);
		System.out.println("Precio: " + telefono1.precio);
		telefono1.encender();
		telefono1.fotos();
		telefono1.juegos();
		System.out.println("Ingrese la marca del telefono");
		telefono2.marca = sc.next();
		System.out.println("Ingrese la gama del telefono");
		telefono2.gama = sc.next();
		System.out.println("Ingrese el precio del telefono");
		telefono2.precio = sc.nextDouble();
		
		System.out.println("\nDatos del primer telefono");
		System.out.println();
		System.out.println("Marca: " + telefono2.marca);
		System.out.println("gama: " + telefono2.gama);
		System.out.println("Precio: " + telefono2.precio);
		telefono2.encender();
		telefono2.fotos();
		telefono2.juegos();
		System.out.println("Ingrese la marca del telefono");
		telefono3.marca = sc.next();
		System.out.println("Ingrese la gama del telefono");
		telefono3.gama = sc.next();
		System.out.println("Ingrese el precio del telefono");
		telefono3.precio = sc.nextDouble();
		
		System.out.println("\nDatos del primer telefono");
		System.out.println();
		System.out.println("Marca: " + telefono3.marca);
		System.out.println("gama: " + telefono3.gama);
		System.out.println("Precio: " + telefono3.precio);
		telefono3.encender();
		telefono3.fotos();
		telefono3.juegos();
		

	}
	
	

}
