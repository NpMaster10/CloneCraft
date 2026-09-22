package net.jamezo97.clonecraft.clone;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import net.minecraft.client.renderer.IImageBuffer;

public class ClassicSkinBuffer
implements IImageBuffer {
    public BufferedImage parseUserSkin(BufferedImage image) {
        if (image == null) {
            return null;
        }
        if (image.getHeight() == 32) {
            return image;
        }
        BufferedImage converted = new BufferedImage(64, 32, 2);
        Graphics g = converted.getGraphics();
        g.drawImage(image, 0, 0, 64, 32, 0, 0, 64, 32, null);
        g.dispose();
        return converted;
    }
    public void func_152634_a() {
    }
}


