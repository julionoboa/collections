# Collections

## Project Description
Collections is an API that receives a JSON file with an array of numbers `[1, 2, 3]` and provides various functions based on the accessed endpoint. There are four available endpoints:

- `/api/sum POST`: Returns the sum of the numbers in the array found in the JSON.
- `/api/largest`: Returns the largest number from the array.
- `/api/smallest`: Returns the smallest number from the array.
- `/api/count`: Returns the number that appears most frequently in the array.
- `/api/countPlus`: Returns the largest number that appears more than once in the array.

## Installation
1. Clone the repository to your local environment: `git clone https://repository-url`
2. Open the project in your preferred Java IDE.
3. Run the project to start a local server on port 8080.
4. To interact with the API, it is recommended to use Postman or any similar tool to make HTTP requests.

## Usage
1. Call the list of numbers with the name `numbers` in the JSON file. The program will recognize this list to perform the operations.
2. Negative numbers will not be taken into account.
3. If you provide an empty array or an array with only negative numbers, the API will throw an HTTP 500 error.
4. If you introduce any non-numeric value (letters, special characters, etc.), an HTTP 500 error will also be generated.
5. The API is designed for educational purposes to understand how arrays work in Java Spring Boot.

## Contribution
This project is open source, and you can contribute in any way you want. If you have ideas to improve the API, add new features, or make corrections, feel free to submit a pull request.

## Credits
This project is authored by [Julio Noboa](https://github.com/julionoboa).

## License
This project is under a permissive license.

## Contact
If you have any questions, suggestions, or concerns, feel free to reach out via email: julionoboa26@gmail.com.

--------------------------------------------------------------------------------------------

Español

--------------------------------------------------------------------------------------------

# Collections

## Descripción del proyecto
Collections es un API que recibe un archivo JSON con un arreglo de números `[1, 2, 3]` y ofrece diversas funciones según el endpoint al que se acceda. Los cuatro endpoints disponibles son:

- `/api/sum POST`: Devuelve la suma de los números en el arreglo que se encuentra en el JSON.
- `/api/largest`: Devuelve el número mayor del arreglo.
- `/api/smallest`: Devuelve el número menor del arreglo.
- `/api/count`: Devuelve el número que más se repite en el arreglo.
- `/api/countPlus`: Devuelve el mayor número que se repite en el arreglo.

## Instalación
1. Clona el repositorio en tu entorno local: `git clone https://ruta-del-repositorio`
2. Abre el proyecto en tu IDE Java de preferencia.
3. Ejecuta el proyecto para iniciar un servidor local en el puerto 8080.
4. Para interactuar con el API, se recomienda utilizar Postman o cualquier herramienta similar para realizar las solicitudes HTTP.

## Uso
1. Llama a la lista de números obligatoriamente con el nombre `numbers` en el archivo JSON. El programa reconocerá esta lista para realizar las operaciones.
2. En caso de introducir números negativos, no serán tomados en cuenta.
3. Si introduces un arreglo vacío o solo números negativos, el API lanzará un error HTTP 500.
4. Si introduces algún valor no numérico (letras, caracteres especiales, etc.), también se generará un error HTTP 500.
5. El API está diseñado con fines educativos para comprender cómo funcionan los arreglos en Java Spring Boot.

## Contribución
Este proyecto es de código abierto y puedes contribuir de la manera que desees. Si tienes ideas para mejorar el API, nuevas funciones o correcciones, no dudes en enviar una solicitud de extracción (pull request).

## Créditos
Este proyecto es de total autoría de [Julio Noboa](https://github.com/julionoboa).

## Licencia
Este proyecto se encuentra bajo licencia libre.

## Contacto
Si tienes alguna pregunta, sugerencia o inquietud, puedes contactarme a través de mi correo electrónico: julionoboa26@gmail.com.



