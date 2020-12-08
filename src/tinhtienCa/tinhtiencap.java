package tinhtienCa;

import java.util.Scanner;

public class tinhtiencap {
	static final float PERSONAL_BILLING_COST = 4.5f;
	static final float PERSONAL_SERVICE_FEE = 20.5f;
	static final float PERSONAL_CHANNEL_FEE = 7.5f;

	static final int BUSSINESS_BILLING_COST = 15;
	static final int BUSSINESS_SERVICE_FEE = 75;
	static final int BUSSINESS_CHANNEL_FEE = 50;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int accountNumber = inputaccountNumber(scan);
		int channel = inputChannel(scan);
		float bsServiceFee = inputbussinessServiceFee(scan);
		int customerId = inputcustomerId(scan);
		float personalCost = personalCount(channel, PERSONAL_BILLING_COST, PERSONAL_SERVICE_FEE);
		float bussinessCost = bussinessCount(channel, BUSSINESS_BILLING_COST, bsServiceFee);
		float count = count(customerId, personalCost, bussinessCost);
		System.out.println("Loai khach hang: " + customerId + " ma so khach hang: " + accountNumber
				+ " So tien phai thanh toan: " + count);

	}

	public static float count(int customerId, float personalCost, float bussinessCost) {
		float totalCount = 0;
		if (customerId == 1) {
			totalCount = personalCost;
		} else if (customerId == 2) {
			totalCount = bussinessCost;
		} else {
			System.out.println("Vui long nhap lai ma khach hang");
		}
		return totalCount;
	}

	public static float bussinessCount(int channel, int BUSSINESS_BILLING_COST, float bsServiceFee) {
		float bussinessCost = channel * BUSSINESS_CHANNEL_FEE + BUSSINESS_BILLING_COST + bsServiceFee;
		return bussinessCost;
	}

	public static float personalCount(int channel, float PERSONAL_BILLING_COST, float PERSONAL_SERVICE_FEE) {
		float personalCost = channel * PERSONAL_CHANNEL_FEE + PERSONAL_BILLING_COST + PERSONAL_SERVICE_FEE;
		return personalCost;
	}

	public static int inputaccountNumber(Scanner scan) {
		int accountNumber;
		System.out.println("Vui long nhap so tai khoan: ");
		accountNumber = Integer.parseInt(scan.nextLine());
		return accountNumber;
	}

	public static int inputChannel(Scanner scan) {
		int channel;
		System.out.println("Vui long nhap so kenh: ");
		channel = Integer.parseInt(scan.nextLine());
		return  channel;
	}

	public static float inputbussinessServiceFee(Scanner scan) {
		float bsServiceFee = 0;
		int bussinessService;
		System.out.println("Vui long nhap so luong ket noi: ");
		bussinessService = Integer.parseInt(scan.nextLine());
		if (bussinessService <= 10) {
			bsServiceFee = BUSSINESS_SERVICE_FEE;
		} else {
			bsServiceFee = BUSSINESS_SERVICE_FEE + (bussinessService - 10) * 5;
		}
		return bsServiceFee;
	}

	public static int inputcustomerId(Scanner scan) {
		int customerId;
		System.out.println("Vui long nhap ma khach hang 1 cho khach hang ca nhan va 2 cho doanh nghiep: ");
		customerId = Integer.parseInt(scan.nextLine());
		return customerId;
	}

}
