package betterachievements.api;


import net.minecraft.item.ItemStack;

/**
 * Implemented on {@link net.minecraftforge.common.AchievementPage}
 * Used for more in depth control
 */
public interface IBetterAchievementPage
{
    /**
     * Has custom draw background method
     * @return true is {@link #drawBackground(int, int, float, float)} is implemented
     */
    boolean hasCustomBackGround();

    /**
     * Drawing the background of the achievement page if {@link #hasCustomBackGround()} is true
     * Can be left unimplemented if {@link #hasCustomBackGround()} is false
     *
     * @param left the x coord of the left side of the background area
     * @param top   the y coord of the top side of the background area
     * @param z           the z level
     * @param scale       the current scale
     */
    void drawBackground(int left, int top, float z, float scale);

    /**
     * Set the zoom level on page load
     * The default minecraft value is 1.0F
     *
     * @return the startup scale
     */
    float setScaleOnLoad();

    /**
     * Highest possible zoom value
     *
     * @return max zoom level
     */
    float getMaxZoom();

    /**
     * Lowest possible zoom value
     *
     * @return min zoom level
     */
    float getMinZoom();

    /**
     * Get the {@link ItemStack} to be displayed on the tab
     *
     * @return if null one will be picked for the page
     */
    ItemStack getPageIcon();
}
