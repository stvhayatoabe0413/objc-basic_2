package sorce;

import java.util.logging.Logger;

public class Main {

	// BOOL型、String型、int型、double型の変数を定義し、コンソールにログを出力する。(Log)

	public static void main(String[] args) {

		boolean b = false;
		String s = "文字列";
		int n = 0;
		double d = 0.0;

		Logger logger = Logger.getLogger("Main");
        logger.info("Boolean = " + b);
        logger.info("String = " + s);
        logger.info("Int = " + n);
        logger.info("Double = " + d);

	}

}
