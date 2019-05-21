package util;

import java.awt.Desktop;
import java.awt.FileDialog;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;

public class Archivo {

	public Archivo(String path) {
		// TODO Auto-generated constructor stub
	}

	public static String searchFile() {
		String path = "";
		FileDialog fd = new FileDialog(new JFrame());
		fd.setVisible(true);
		java.io.File[] f = fd.getFiles();
		if (f.length > 0) {
			path = fd.getFiles()[0].getAbsolutePath();
		}

		return path;
	}
	
	public static void openFile(String path)
	{
		File objetofile = new File (path);
        try {
			Desktop.getDesktop().open(objetofile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
