package com.online.fungsidengankembaliannilai;

// block class
class CalculateArea {

	// fungsi dengan mengembalikan nilai
	static int luasPersegi(int sisi) {
		int luas = sisi * sisi;
		// mengembalikan nilai "return"
		return luas;
	}

	// fungsi main()
	public static void main(String[] args) {
		// memanggil/eksekusi fungsi LuasPersegi()
		System.out.println("Luas Persegi dengan panjang sisi 5 adalah " + luasPersegi(5));
	}

}
