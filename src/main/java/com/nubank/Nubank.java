package com.nubank;

import com.totalcross.sample.nubank.SplashWindow;
import com.totalcross.sample.nubank.ui.Inicial;

import totalcross.sys.Settings;
import totalcross.ui.MainWindow;

public class Nubank extends MainWindow {

	public Nubank() {
		setUIStyle(Settings.MATERIAL_UI);
	}

	static {
		Settings.applicationId = "NUBK";
		Settings.appVersion = "1.0.0";
		Settings.iosCFBundleIdentifier = "com.totalcross.sample.nubank";
	}

	public void initUI() {
		SplashWindow sp;
		Inicial inicial = new Inicial();

		sp = new SplashWindow();
		sp.popupNonBlocking();
		swap(inicial);
	}

}
