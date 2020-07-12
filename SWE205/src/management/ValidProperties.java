package management;

import exceptions.NotValidBrandException;
import exceptions.NotValidColorException;
import exceptions.NotValidModelException;
import exceptions.NotValidSizeException;
import java.util.ArrayList;

public class ValidProperties {
	
	private ArrayList<String> validColors, validBrands, validSizes, validModels;

	public ValidProperties(ArrayList<String> validColors, ArrayList<String> validBrands, ArrayList<String> validSizes,
			ArrayList<String> validModels) {
		super();
		this.validColors = validColors;
		this.validBrands = validBrands;
		this.validSizes = validSizes;
		this.validModels = validModels;
	}

	
	//color Methods
	public ArrayList<String> getValidColors() {
		return validColors;
	}

	public void setValidColors(ArrayList<String> validColors) {
		this.validColors = validColors;
	}

	public boolean addValidColor(String validColor) {
		return validColors.add(validColor);
	}

	public String getValidColor(int index) {
		
		return validColors.get(index);
	}
	
	public String getValidColor(String color) throws NotValidColorException{
		for(String b: validColors){
			if(b.equalsIgnoreCase(color)){
				System.out.println("Found");
				return b;
			}
				
		}
		
		throw new NotValidColorException();
	}
	
	public String removeValidColor(int index) {
		return validColors.remove(index);
	}

	public boolean removeValidColor(String validColor){
		return validColors.remove(validColor);
	}

	public boolean isValidColor(String color){
		try{
			getValidColor(color);
			return true;
		}
		catch (NotValidColorException e) {
			return false;
		}
	}
	
	
	
	//Brand methods
	public ArrayList<String> getValidBrands() {
		return validBrands;
	}

	public void setValidBrands(ArrayList<String> validBrands) {
		this.validBrands = validBrands;
	}

	public boolean addValidBrand(String validBrand) {
		return validBrands.add(validBrand);
	}

	public String getValidBrand(int index) {
		
		return validBrands.get(index);
	}

	public String getValidBrand(String brand) throws NotValidBrandException{
		for(String b: validBrands){
			if(b.equalsIgnoreCase(brand))
			return b;
		}
		
		throw new NotValidBrandException();
	}
	
	public String removeValidBrand(int index) {
		return validBrands.remove(index);
	}

	public boolean removeValidBrand(String validBrand){
		return validBrands.remove(validBrand);
	}

	public boolean isValidBrand(String brand){
		try{
			getValidBrand(brand);
			return true;
		}
		catch (NotValidBrandException e) {
			return false;
		}
	}
	
	
	
	//size methods
	public ArrayList<String> getValidSizes() {
		return validSizes;
	}

	public void setValidSizes(ArrayList<String> validSizes) {
		this.validSizes = validSizes;
	}

	public boolean addValidSize(String validSize) {
		return validSizes.add(validSize);
	}

	public String getValidSize(int index) {
		
		return validSizes.get(index);
	}

	
	public String getValidSize(String size) throws NotValidSizeException{
		for(String b: validSizes){
			if(b.equalsIgnoreCase(size))
			return b;
		}
		
		throw new NotValidSizeException();
	}
	
	public String removeValidSize(int index) {
		return validSizes.remove(index);
	}

	public boolean removeValidSize(String validSize){
		return validSizes.remove(validSize);
	}

	public boolean isValidSize(String size){
		try{
			getValidSize(size);
			return true;
		}
		catch (NotValidSizeException e) {
			return false;
		}
	}
	

	
	//model Methods
	public ArrayList<String> getValidModels() {
		return validModels;
	}

	public void setValidModels(ArrayList<String> validModels) {
		this.validModels = validModels;
	}

	public boolean addValidModel(String validModel) {
		return validModels.add(validModel);
	}

	public String getValidModel(int index) {
		
		return validModels.get(index);
	}
	
	public String getValidModel(String model) throws NotValidModelException{
		for(String b: validModels){
			if(b.equalsIgnoreCase(model))
			return b;
		}
		
		throw new NotValidModelException();
	}
	
	public String removeValidModel(int index) {
		return validModels.remove(index);
	}

	public boolean removeValidModel(String validModel){
		return validModels.remove(validModel);
	}

	public boolean isValidModel(String model){
		try{
			getValidModel(model);
			return true;
		}
		catch (NotValidModelException e) {
			return false;
		}
	}
	

	public boolean isValidCar(Car c){
		boolean valid= isValidBrand(c.getBrand()) && isValidColor(c.getColor())&& isValidModel(c.getModel()) && isValidSize(c.getSize());
		return valid;
	}
}

