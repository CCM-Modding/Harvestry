package ccm.harvestry.enums;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import ccm.harvestry.utils.lib.Locations;
import ccm.nucleum_omnium.helper.TextureHelper;

public enum FoodEnum
{
    // Food Items (TODO PUT IN THE RIGHT VALUES!)
    foodSeedsPeanuts(2, 0.3F),
    foodSeedsPeanutsPoisonous(1, 0.1F),
    foodSeedsCorn(4, 0.4F),
    foodCheese(6, 0.5F),
    foodTomato(5, 0.5F),
    foodLemon(4, 0.4F),
    foodOrange(5, 0.5F),
    foodCorn(6, 0.6F),
    foodSalad(6, 0.6F),
    foodAppleSauce(4, 0.6F),
    foodBerryBlue(5, 0.4F),
    foodBerryCherry(5, 0.4F),
    foodBerryStrawberry(4, 0.6F),
    foodBerryStrawberrySugar(5, 0.4F),
    foodCandyCane(1, 0.2F),
    foodCandyCaramel(1, 0.4F),
    foodEggs(6, 0.6F),
    foodEggsScrambled(6, 0.5F),
    foodCookie(2, 0.2F),
    foodCookieChocolateChip(2, 0.2F),
    foodCookieSugar(2, 0.2F),
    foodPieApple(8, 0.4F),
    foodPieBerryBlue(8, 0.3F),
    foodPieBerryCherry(8, 0.3F),
    foodMeatBacon(3, 0.2F),
    foodChickenFried(5, 0.4F),
    foodChickenGrilled(5, 0.6F),
    foodChickenLeg(4, 0.4F),
    foodChickenNuggets(2, 0.2F),
    foodChickenStrips(4, 0.3F),
    foodPizza(10, 1.0F),
    foodPizzaCheese(10, 1.0F),
    foodSandwichHam(5, 0.5F),
    foodSandwichPB_J(5, 0.4F),
    foodSandwichCheese(4, 0.7F),
    foodSandwichCheeseGrilled(6, 0.5F),
    foodSandwichChickenFried(7, 0.6F),
    foodSandwichChickenGrilled(7, 0.7F),
    foodBagOChips(2, 0.2F),
    foodBoxOFries(2, 0.2F),
    foodFriedButter(2, 0.2F),
    foodHamburger(8, 0.9F),
    foodTaco(6, 0.0F),
    foodBurito(8, 0.0F),
    foodSpaghetti(8, 0.8F),
    foodBerryGrape(4, 0.4F);

    public final String texture;

    public final int    heal;

    public final float  saturation;

    private Icon        icon;

    private FoodEnum(final int heal,
                     final float saturation)
    {
        this.texture = TextureHelper.getTextureFromName(this.name(), Locations.TEXTURE + "food/");
        this.heal = heal;
        this.saturation = saturation;
    }

    public Icon getIcon()
    {
        return this.icon;
    }

    public static void registerIcons(final IconRegister register)
    {
        for (final FoodEnum item : FoodEnum.values()){
            item.icon = register.registerIcon(item.texture);
        }
    }
}