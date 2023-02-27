# VideoClub-Java (En Español)
Proyecto con Java 8 - jUnit - Metodologia TDD - Practica - Programación Basica II - UNLAM

La empresa Blockbuster Argentina nos contrató para ayudarlos en el desarrollo de un sistema para llevar el registro de las operaciones que se pueden realizar en sus productos. 
 <br>Siendo conscientes de los cambios en la industria, la empresa comenzó a trabajar con los siguientes tipos de productos: <br>
• Películas / Videojuegos / Libros /  Comestibles <br> <br>
Los productos tienen un código y una descripción, y dependiendo del tipo de producto aparecen características adicionales: <br>
 <br>Películas: <br>
• Genero (INFANTIL, COMEDIA, ACCION, TERROR y SUSPENSO) <br>
• Año de estreno <br>
• Director <br>
• Actores principales <br> <br>
Videojuegos: <br>
• Tipo de consola (PLAY_STATION, PC, WII) <br>
• Libros <br>
• Autor <br>
• Editorial <br> <br>
Las operaciones disponibles en el video club son dos: <br>
• Venta <br>
• Alquiler <br> <br>
Sin embargo, no todos los productos pueden ser vendidos y / o alquilados. <br>
Los productos “Vendibles” son las películas, los libros y los comestibles y para ello debemos poder conocer el precioDeVenta() <br>
Mientras que los productos “Alquilables” son las películas y los videojuegos y por consiguiente, debemos poder conocer el precioDeAlquiler(). <br> <br>
De los clientes nos interesa saber el codigoDeCliente, el nombre, el apellido y la edad. <br>
Se deben respetar las siguientes condiciones: <br>
1. Los productos “alquilables” pueden prestarse siempre y cuando estén disponibles. Es decir: <br>- No se haya prestado previamente   <br>- El cliente anterior haya devuelto el producto. <br>
2. Los clientes sólo podrán realizar hasta 2 alquileres al mismo tiempo. <br>
3. Los productos alquilables deben tener una calificación (Aptos para todo público, para mayores de 7 años, 18 años, etc), y sólo se pueden alquilar a aquellos clientes que tengan una edad mayor a la de dicha clasificación.

# VideoClub-Java (In English)
Project with Java 8 - jUnit - TDD Methodology - Practice - Basic Programming II - UNLAM

The company Blockbuster Argentina hired us to help in the development of a system to carry out the registration of the operations that can be carried out in their products.
 <br>Being aware of the changes in the industry, the company began working with the following types of products: <br>
• Movies / Video Games / Books / Groceries <br> <br>
The products have a code and a description, and depending on the type of product additional features appear: <br>
 <br>Movies: <br>
• Genre (CHILDREN, COMEDY, ACTION, TERROR and SUSPENSE) <br>
• Release year <br>
• Director <br>
• Main actors <br> <br>
Video games: <br>
• Console type (PLAY_STATION, PC, WII) <br>
• Books <br>
• Author <br>
• Editorial <br> <br>
The operations available in the video club are two: <br>
• Sale <br>
• Rent <br> <br>
However, not all products can be sold and/or rented. <br>
The “Sellable” products are movies, books and groceries and for this we must be able to know the SalePrice() <br>
While the "Rentable" products are movies and video games and therefore, we must be able to know the rentalPrice(). <br> <br>
Of the clients we are interested in knowing the client code, the name, the surname and the age. <br>
The following conditions must be respected: <br>
1. “Rentable” products can be borrowed as long as they are available. That is to say: <br>- It has not previously been provided <br>- The previous customer has returned the product. <br>
2. Customers may only make up to 2 rentals at the same time. <br>
3. Rentable products must have a rating (Suitable for all audiences, for people over 7 years old, 18 years old, etc.), and can only be rented to those clients who are older than said classification.
