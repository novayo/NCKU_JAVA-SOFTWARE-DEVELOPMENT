package com.main.gfx;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.main.Id;

/*
 * 取得圖片資源
 */

public class ImageSheet {

	private final int perImageSize = 64; // 設定會抓到每32*32為一個圖片
	private final int offset = 4; // 抓的位置可能會不精準，用這個參數去調整
	private BufferedImage imageSheet;

	public ImageSheet(String path) {
		// 拿到image的整個檔案
		try {
			imageSheet = ImageIO.read(getClass().getResource(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public BufferedImage getImage(int x, int y, Id kind) {
		if (kind == Id.GET_ONE_OF_SHEET) { // 拿到Sheet的其中一格
			return imageSheet.getSubimage(x * perImageSize - perImageSize + offset,
					y * perImageSize - perImageSize + offset, perImageSize - offset, perImageSize - offset);
		} 
		
		
		else if (kind == Id.GET_HEART) { // 拿愛心
			return imageSheet.getSubimage(x * perImageSize - perImageSize + offset + 6,
					y * perImageSize - perImageSize + offset + 10, perImageSize - offset - 12, perImageSize - offset - 20);
		} else if (kind == Id.GET_TONTOKO_PLAYER) { // 拿Tontoko Player
			return imageSheet.getSubimage(x * perImageSize - perImageSize + offset + 10,
					y * perImageSize - perImageSize + offset, perImageSize - offset - 20, perImageSize - offset);
		} else if (kind == Id.GET_TONTOKO_OBSTACLE) { // 拿Tontoko Player
			return imageSheet.getSubimage(x * perImageSize - perImageSize + offset,
					y * perImageSize - perImageSize + offset + 10, perImageSize - offset, perImageSize - offset - 10);
		} else if (kind == Id.GET_DINO_STAND_RUN) { // 拿恐龍站著跟跑步
			return imageSheet.getSubimage(x * perImageSize - perImageSize + offset + 11,
					y * perImageSize - perImageSize + offset + 7, perImageSize - offset - 11,
					perImageSize - offset - 7);
		} 
		
		
		else if (kind == Id.GET_DINO_SQUART) { // 拿恐龍蹲下
			return imageSheet.getSubimage(x * perImageSize - perImageSize + offset,
					y * perImageSize - perImageSize + offset + 31, perImageSize - offset, perImageSize - offset - 31);
		} 
		
		
		else if (kind == Id.GET_DINO_DRAGON_0) { // 拿飛龍0
			return imageSheet.getSubimage(x * perImageSize - perImageSize + offset + 6,
					y * perImageSize - perImageSize + offset+20, perImageSize - offset - 6,
					perImageSize - offset - 20);
		} else if (kind == Id.GET_DINO_DRAGON_1) { // 拿飛龍1
			return imageSheet.getSubimage(x * perImageSize - perImageSize + offset + 8,
					y * perImageSize - perImageSize + offset + 15, perImageSize - offset - 8,
					perImageSize - offset - 25);
		} else if (kind == Id.GET_TAIKO_RED) { // 拿太鼓達人 紅敵人
			return imageSheet.getSubimage(x * perImageSize - perImageSize + offset,
					y * perImageSize - perImageSize + offset, perImageSize - offset, perImageSize - offset);
		} else if (kind == Id.GET_TAIKO_GREEN) { // 拿太鼓達人 藍敵人
			return imageSheet.getSubimage(x * perImageSize - perImageSize + offset,
					y * perImageSize - perImageSize + offset, perImageSize - offset, perImageSize - offset);
		} else if (kind == Id.GET_CONTRA_RUN) { // 拿魂斗羅 走路
			return imageSheet.getSubimage(x * perImageSize - perImageSize + offset + 14,
					y * perImageSize - perImageSize + offset, perImageSize - offset - 14, perImageSize - offset);
		} else if (kind == Id.GET_CONTRA_JUMP) { // 拿魂斗羅 跳躍
			return imageSheet.getSubimage(x * perImageSize - perImageSize + offset + 7,
					y * perImageSize - perImageSize + offset + 10, perImageSize - offset - 15,
					perImageSize - offset - 20);
		} else if (kind == Id.GET_CONTRA_BULLET) { // 拿魂斗羅 子彈
			return imageSheet.getSubimage(x * perImageSize - perImageSize + offset + 26,
					y * perImageSize - perImageSize + offset + 26, perImageSize - offset - 52,
					perImageSize - offset - 52);
		} else if (kind == Id.GET_CONTRA_BOSS) { // 拿魂斗羅 Boss
			return imageSheet.getSubimage(x * perImageSize - perImageSize + offset,
					y * perImageSize - perImageSize + offset, perImageSize - offset, perImageSize - offset);
		} else if (kind == Id.GET_CONTRA_INSECTS) { // 拿魂斗羅 昆蟲
			return imageSheet.getSubimage(x * perImageSize - perImageSize + offset + 22,
					y * perImageSize - perImageSize + offset + 22, perImageSize - offset - 44,
					perImageSize - offset - 44);
		} else if (kind == Id.GET_FLOOR) { // 拿到地板
			return imageSheet.getSubimage(x * perImageSize - perImageSize + offset,
					y * perImageSize - perImageSize + offset, perImageSize * 7 - offset, perImageSize - offset);
		}
		return imageSheet; // 如果是-1，拿到整張圖片
	}

	public BufferedImage getDino_Stand_Run_Image(int x, int y) {
		return imageSheet.getSubimage(x * perImageSize - perImageSize + offset + 2,
				y * perImageSize - perImageSize + offset, perImageSize - offset, perImageSize - offset);
	}

}
