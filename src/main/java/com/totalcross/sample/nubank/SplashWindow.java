package com.totalcross.sample.nubank;

import com.totalcross.sample.nubank.util.Images;

import totalcross.ui.ImageControl;
import totalcross.ui.Window;
import totalcross.ui.anim.ControlAnimation;
import totalcross.ui.anim.FadeAnimation;

public class SplashWindow extends Window {
	private ImageControl logo, back;

	public SplashWindow() {

	}

	protected void onPopup() {
		Images.loadImages(footerColor);
		
		back = new ImageControl(Images.fundo);
		back.scaleToFit = true;
		back.centerImage = true;
		back.strechImage = true;
		back.hwScale = true;
		add(back, LEFT, TOP, FILL, FILL);
		
		logo = new ImageControl(Images.logo_branco);
		logo.scaleToFit = true;
		logo.centerImage = true;
		logo.transparentBackground = true;
		add(logo, CENTER, CENTER, PARENTSIZE + 50, PARENTSIZE + 50);
		
		FadeAnimation.create(logo, true, null, 3000)
			.then(FadeAnimation.create(logo, false, this::onAnimationFinished, 3000))
			.start();
	}
	
	public void onAnimationFinished(ControlAnimation anim) {
		this.unpop();
	}

}
