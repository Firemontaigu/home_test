import spark.servlet.SparkApplication;

import static spark.Spark.get;

public class HelloWorld implements SparkApplication {
	public static void main(String[] args) {
		new HelloWorld().init();
	}

	@Override
	public void init() {
		get("/hello", (req, res) -> "Hello world de la part de jimmy depuis ce dimanche 04 septembre 2022");
		get("/m2i", (req, res) -> "Hello World de villeneuved'ascque de Lille ce dimanche jour de braderie");
		get("/foot", (req, res) -> "Hello World hala madrid y nada mas a hoy a hier y para siempre let's go");
		get("/jimmy", (req, res) -> "Hello World de la maison ce dimanche 4 septembre 2022");

	}
}
