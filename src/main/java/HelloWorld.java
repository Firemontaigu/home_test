import spark.servlet.SparkApplication;

import static spark.Spark.get;

public class HelloWorld implements SparkApplication {
	public static void main(String[] args) {
		new HelloWorld().init();
	}

	@Override
	public void init() {
		get("/hello", (req, res) -> "Hello world de la part de jimmy depuis ce dimanche");
		get("/m2i", (req, res) -> "Hello World de villeneuved'ascque de Lille ce dimanche ");
		get("/foot", (req, res) -> "Hello World hala madrid y nada mas a hoy a hier y para siempre");
		get("/jimmy", (req, res) -> "Hello World de la maison ce dimanche 4 septembre");

	}
}
