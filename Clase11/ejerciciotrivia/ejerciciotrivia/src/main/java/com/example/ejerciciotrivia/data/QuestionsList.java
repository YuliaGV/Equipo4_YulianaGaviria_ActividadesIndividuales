package com.example.ejerciciotrivia.data;

import com.example.ejerciciotrivia.entities.Question;

import java.util.ArrayList;
import java.util.List;

public class QuestionsList {

    public static List<Question> getQuestionList(){   //Static para que no tengamos que instanciar esta clase

        Question q1 = new Question();
        q1.setCategory("Programacion");
        q1.setQuestion("¿Qué es Java?");
        q1.setOptions(new String[]{"Un lenguaje de programación", "Un instrumento musical", "Un género musical", "Una ciudad en Indonesia"});
        q1.setAnswer(0);
        q1.setExplanation("Java es un lenguaje de programación de propósito general.");

        Question q2 = new Question();
        q2.setCategory("Musica Rock");
        q2.setQuestion("¿Qué banda lanzó el álbum 'Back in Black'?");
        q2.setOptions(new String[]{"AC/DC", "Guns N' Roses", "Led Zeppelin", "Queen"});
        q2.setAnswer(0);
        q2.setExplanation("La banda AC/DC lanzó el álbum 'Back in Black'.");

        Question q3 = new Question();
        q3.setCategory("Videojuegos");
        q3.setQuestion("¿Cuál es el videojuego más vendido de todos los tiempos?");
        q3.setOptions(new String[]{"Minecraft", "Tetris", "Grand Theft Auto V", "PlayerUnknown's Battlegrounds"});
        q3.setAnswer(2);
        q3.setExplanation("Grand Theft Auto V ha sido uno de los videojuegos más exitosos en términos de ventas.");

        Question q4 = new Question();
        q4.setCategory("Geografia");
        q4.setQuestion("¿Cuál es el río más largo del mundo?");
        q4.setOptions(new String[]{"Amazonas", "Nilo", "Yangtsé", "Mississippi"});
        q4.setAnswer(0);
        q4.setExplanation("El río Amazonas es considerado el más largo del mundo, con una longitud aproximada de 6,400 kilómetros.");

        Question q5 = new Question();
        q5.setCategory("Biologia");
        q5.setQuestion("¿Cuál es el órgano más grande del cuerpo humano?");
        q5.setOptions(new String[]{"La piel", "El corazón", "El hígado", "Los pulmones"});
        q5.setAnswer(0);
        q5.setExplanation("La piel es el órgano más grande del cuerpo humano, que cumple varias funciones importantes.");

        Question q6 = new Question();
        q6.setCategory("Matematicas");
        q6.setQuestion("¿Cuál es el resultado de 2 + 2?");
        q6.setOptions(new String[]{"1", "3", "4", "5"});
        q6.setAnswer(2);
        q6.setExplanation("La suma de 2 + 2 es igual a 4.");


        Question q7 = new Question();
        q7.setCategory("Programacion");
        q7.setQuestion("¿Qué es un bucle 'for'?");
        q7.setOptions(new String[]{"Una estructura de control", "Una función matemática", "Un tipo de dato", "Un lenguaje de programación"});
        q7.setAnswer(0);
        q7.setExplanation("Un bucle 'for' es una estructura de control utilizada para repetir un bloque de código un número determinado de veces.");

        Question q8 = new Question();
        q8.setCategory("Musica Rock");
        q8.setQuestion("¿Cuál es la banda de rock más icónica de todos los tiempos?");
        q8.setOptions(new String[]{"The Beatles", "Queen", "Led Zeppelin", "The Rolling Stones"});
        q8.setAnswer(0);
        q8.setExplanation("The Beatles es considerada una de las bandas de rock más icónicas y con mayor influencia en la historia de la música.");

        Question q9 = new Question();
        q9.setCategory("Videojuegos");
        q9.setQuestion("¿Cuál es el juego más vendido de la saga 'Super Mario'?");
        q9.setOptions(new String[]{"Super Mario Bros.", "Super Mario 64", "Super Mario Odyssey", "Super Mario Galaxy"});
        q9.setAnswer(0);
        q9.setExplanation("El juego más vendido de la saga 'Super Mario' es 'Super Mario Bros.' para la consola NES.");

        Question q10 = new Question();
        q10.setCategory("Geografia");
        q10.setQuestion("¿Cuál es el país más grande del mundo por área terrestre?");
        q10.setOptions(new String[]{"Rusia", "Canadá", "China", "Estados Unidos"});
        q10.setAnswer(0);
        q10.setExplanation("Rusia es el país más grande del mundo por área terrestre, abarcando una extensa región de Europa del Este y Asia del Norte.");

        Question q11 = new Question();
        q11.setCategory("Biologia");
        q11.setQuestion("¿Cuál es la función principal del corazón en el cuerpo humano?");
        q11.setOptions(new String[]{"Bombeo de sangre", "Digestión de alimentos", "Respiración", "Visión"});
        q11.setAnswer(0);
        q11.setExplanation("El corazón tiene la función principal de bombear la sangre y distribuirla por todo el cuerpo.");

        Question q12 = new Question();
        q12.setCategory("Matematicas");
        q12.setQuestion("¿Cuál es el resultado de 9 * 7?");
        q12.setOptions(new String[]{"63", "56", "72", "81"});
        q12.setAnswer(0);
        q12.setExplanation("El resultado de 9 multiplicado por 7 es igual a 63.");



        Question q13 = new Question();
        q13.setCategory("Programacion");
        q13.setQuestion("¿Qué es un algoritmo?");
        q13.setOptions(new String[]{"Un conjunto de instrucciones", "Un tipo de variable", "Un error de programación", "Un resultado de operaciones matemáticas"});
        q13.setAnswer(0);
        q13.setExplanation("Un algoritmo es un conjunto de instrucciones lógicas y bien definidas que resuelven un problema o realizan una tarea específica.");

        Question q14 = new Question();
        q14.setCategory("Musica Rock");
        q14.setQuestion("¿Cuál es el álbum más vendido de la historia del rock?");
        q14.setOptions(new String[]{"Back in Black - AC/DC", "The Dark Side of the Moon - Pink Floyd", "Led Zeppelin IV - Led Zeppelin", "Thriller - Michael Jackson"});
        q14.setAnswer(0);
        q14.setExplanation("El álbum 'Back in Black' de AC/DC es considerado el más vendido de la historia del rock.");

        Question q15 = new Question();
        q15.setCategory("Videojuegos");
        q15.setQuestion("¿Cuál de los siguientes juegos tiene una historia post-apoliptica en un mundo abierto");
        q15.setOptions(new String[]{"FIFA 18", "Tetris", "Grand Theft Auto V", "Fallout 4"});
        q15.setAnswer(3);
        q15.setExplanation("Fallout se desarrolla en escenarios post guerra nuclear");

        Question q16 = new Question();
        q16.setCategory("Geografia");
        q16.setQuestion("¿Cuál es el océano más grande del mundo?");
        q16.setOptions(new String[]{"Océano Pacífico", "Océano Atlántico", "Océano Índico", "Océano Ártico"});
        q16.setAnswer(0);
        q16.setExplanation("El océano Pacífico es considerado el más grande del mundo en términos de área y volumen.");

        Question q17 = new Question();
        q17.setCategory("Biologia");
        q17.setQuestion("¿Cuál es la función principal de los riñones en el cuerpo humano?");
        q17.setOptions(new String[]{"Filtrar y eliminar desechos", "Producir hormonas", "Controlar la temperatura corporal", "Realizar la fotosíntesis"});
        q17.setAnswer(0);
        q17.setExplanation("Los riñones tienen la función principal de filtrar la sangre y eliminar los desechos y el exceso de líquido del cuerpo.");

        Question q18 = new Question();
        q18.setCategory("Matematicas");
        q18.setQuestion("¿Cuál es el resultado de 12 / 3?");
        q18.setOptions(new String[]{"4", "3", "2", "6"});
        q18.setAnswer(0);
        q18.setExplanation("La división de 12 entre 3 es igual a 4.");


        List<Question> questionsList = new ArrayList<>();
        questionsList.add(q1);
        questionsList.add(q2);
        questionsList.add(q3);
        questionsList.add(q4);
        questionsList.add(q5);
        questionsList.add(q6);
        questionsList.add(q7);
        questionsList.add(q8);
        questionsList.add(q9);
        questionsList.add(q10);
        questionsList.add(q11);
        questionsList.add(q12);
        questionsList.add(q13);
        questionsList.add(q14);
        questionsList.add(q15);
        questionsList.add(q16);
        questionsList.add(q17);
        questionsList.add(q18);



        return questionsList;


    }


}
