package forestry.factory;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.item.ItemStack;

import net.minecraftforge.fluids.FluidStack;

import forestry.api.recipes.ICarpenterManager;
import forestry.api.recipes.ICentrifugeManager;
import forestry.api.recipes.IFabricatorManager;
import forestry.api.recipes.IFermenterManager;
import forestry.api.recipes.IMoistenerManager;
import forestry.api.recipes.ISqueezerManager;
import forestry.api.recipes.IStillManager;

public class DummyManagers {

	public static class CarpenterManager implements ICarpenterManager {

		@Override
		public void addRecipe(ItemStack box, ItemStack product, Object... materials) {

		}

		@Override
		public void addRecipe(int packagingTime, ItemStack box, ItemStack product, Object... materials) {

		}

		@Override
		public void addRecipe(int packagingTime, FluidStack liquid, ItemStack box, ItemStack product, Object... materials) {

		}

		@Override
		public void addCrating(String toCrate, ItemStack unpack, ItemStack crated) {

		}

		@Override
		public void addCrating(ItemStack itemStack) {

		}

		@Override
		public void addCratingWithOreDict(ItemStack itemStack) {

		}

		@Override
		public Map<Object[], Object[]> getRecipes() {
			return null;
		}
	}

	public static class CentrifugeManager implements ICentrifugeManager {

		@Override
		public void addRecipe(int timePerItem, ItemStack resource, HashMap<ItemStack, Integer> products) {

		}

		@Override
		public void addRecipe(int timePerItem, ItemStack resource, ItemStack[] produce, int[] chances) {

		}

		@Override
		public void addRecipe(int timePerItem, ItemStack resource, ItemStack primary, ItemStack secondary, int chance) {

		}

		@Override
		public void addRecipe(int timePerItem, ItemStack resource, ItemStack primary) {

		}

		@Override
		public Map<Object[], Object[]> getRecipes() {
			return null;
		}
	}

	public static class FabricatorManager implements IFabricatorManager {

		@Override
		public void addRecipe(ItemStack plan, FluidStack molten, ItemStack result, Object[] pattern) {

		}

		@Override
		public void addSmelting(ItemStack resource, FluidStack molten, int meltingPoint) {

		}

		@Override
		public Map<Object[], Object[]> getRecipes() {
			return null;
		}
	}

	public static class FermenterManager implements IFermenterManager {

		@Override
		public void addRecipe(ItemStack resource, int fermentationValue, float modifier, FluidStack output, FluidStack liquid) {

		}

		@Override
		public void addRecipe(ItemStack resource, int fermentationValue, float modifier, FluidStack output) {

		}

		@Override
		public Map<Object[], Object[]> getRecipes() {
			return null;
		}
	}

	public static class MoistenerManager implements IMoistenerManager {

		@Override
		public void addRecipe(ItemStack resource, ItemStack product, int timePerItem) {

		}

		@Override
		public Map<Object[], Object[]> getRecipes() {
			return null;
		}
	}

	public static class SqueezerManager implements ISqueezerManager {

		@Override
		public void addRecipe(int timePerItem, ItemStack[] resources, FluidStack liquid, ItemStack remnants, int chance) {

		}

		@Override
		public void addRecipe(int timePerItem, ItemStack[] resources, FluidStack liquid) {

		}

		@Override
		public Map<Object[], Object[]> getRecipes() {
			return null;
		}
	}

	public static class StillManager implements IStillManager {

		@Override
		public void addRecipe(int cyclesPerUnit, FluidStack input, FluidStack output) {

		}

		@Override
		public Map<Object[], Object[]> getRecipes() {
			return null;
		}
	}
}