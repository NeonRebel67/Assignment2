package tryMVC;

public class StoreController {
	private Store model;
	private StoreView view;

	public StoreController(Store model, StoreView view){
		this.model = model;
		this.view = view;
	}

	public void addCustomer(Customer name){
		model.addCustomer(name);
		view.printStoreDetails(model);
	}
}
