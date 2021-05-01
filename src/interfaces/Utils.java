package interfaces;

public class Utils {
	public static void Runloggers (Logger[] loggers, String message) {     //STATIC yaptik
		for(Logger logger:loggers){
		logger.log(message);
		}
	}

}
