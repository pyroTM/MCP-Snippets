import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import net.minecraft.client.gui.inventory.GuiInventory;

public class MiniPlayerMod extends HudMod{

	public MiniPlayerMod() {
		super("MiniPlayer", 100, 100);
		
	}
	
	@Override
	public void draw() {
		if (this.mc.thePlayer.isSprinting() || this.mc.thePlayer.isSneaking()) {
            GuiInventory.drawEntityOnScreen(this.getX() + 15, this.getY() + 50, 25, 50.0f, 0.0f, this.mc.thePlayer);
        }
		
		super.draw();
	}
	
	@Override
	public void renderDummy(int mouseX, int mouseY) {
		 GuiInventory.drawEntityOnScreen(this.getX() + 15, this.getY() + 50, 25, 50.0f, 0.0f, this.mc.thePlayer);
	     super.renderDummy(mouseX, mouseY);
	}
	
	@Override
	public int getWidth() {
		return 30;
	}
	
	@Override
	public int getHeight() {
		return 20;
	}
	
	 private String getTime() {
	        final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("[h:mm a]");
	        final LocalDateTime localtime = LocalDateTime.now();
	        return dtf.format(localtime);
	    }
	
	

}
