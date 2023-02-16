/*
Copyright [2022] [Jesús Joana Azuara]
 
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
		You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.06 
    Unless required by applicable law or agreed to in writing, software
    distributed Jesús Joana Azuarastributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
	  limitations under the Licene.
*/

package mates;

/**
	* Una clase que permite calcular el número Pi mediante el metodo de Montecarlo (es una aproximación más o menos
	* precisa, en función del número de iteraciones que realicemos)
*/
public class Matematicas{


/**
	* Método estático que implementa el método de Montecarlo, se le pasa por parámetro el número de iteraciones
	* que vamos a realizar a la hora de calcular el número Pi
	* @param pasos Nº de iteraciones.
	* @return Pi.
*/
	public static double calcularNumeroPi(long pasos){
		double dentroCirculo=0.0;
		double dentroCuadrado=0.0;
		final int areaCuadrado = 4;
		double coordenadaX;
		double coordenadaY;
		double numeroPi;

		// Check if the number of steps is positive
		if (pasos < 0){
			System.out.println("El número de pasos debe ser positivo");
		}
		else{
			// Calculate the number of points inside the circle and the square
			for (int i=0; i< pasos; i++){
				coordenadaX = 1 - 2 * Math.random();
				coordenadaY = 1 - 2 * Math.random();

				// Check if the point is inside the circle
				if (Math.sqrt(Math.pow(coordenadaX , 2) + Math.pow(coordenadaY, 2)) <= 1){
					dentroCirculo++;
				} 
				dentroCuadrado++;
				// Log the current status
				System.out.println("Step: " + i + " inside circle: " + dentroCirculo + " inside square: " + dentroCuadrado);
			}

			// Calculate Pi
			numeroPi = areaCuadrado * (dentroCirculo/dentroCuadrado);
			return numeroPi;
		}
		return 0;
	}

}
