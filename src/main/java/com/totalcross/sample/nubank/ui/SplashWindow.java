package com.totalcross.sample.nubank.ui;

import com.totalcross.sample.nubank.util.Images;

import totalcross.io.IOException;
import totalcross.ui.ImageControl;
import totalcross.ui.Window;
import totalcross.ui.anim.ControlAnimation;
import totalcross.ui.anim.FadeAnimation;
import totalcross.ui.image.ImageException;

public class SplashWindow extends Window {

	public SplashWindow() throws IOException, ImageException {

	}

	protected void onPopup() {
		Images.loadImages(fmH);
		ImageControl logo, back;

		back = new ImageControl(Images.ic_adaptive_launcher_shell_background_retang);
		back.scaleToFit = true;
		back.centerImage = true;
		back.hwScale = true;
		back.strechImage = true;
		add(back, LEFT, TOP, FILL, FILL);

		logo = new ImageControl(Images.logo_branco);
		logo.scaleToFit = true;
		logo.centerImage = true;
		logo.transparentBackground = true;
		add(logo, CENTER, CENTER, PARENTSIZE + 50, PARENTSIZE + 50);

		FadeAnimation.create(logo, true, null, 3000)
				.then(FadeAnimation.create(logo, false, this::onAnimationFinished, 3000)).start();
	}

	public void onAnimationFinished(ControlAnimation anim) {
		this.unpop();
	}

}
