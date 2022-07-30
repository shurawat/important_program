package prepare.classloader;

public class CustomClassLoader extends ClassLoader {

	@Override
	protected Class findClass(String name) throws ClassNotFoundException {
		getClass().getResourceAsStream(name);
		return defineClass(name, new byte[2], 0, 0);
		}
	

}
