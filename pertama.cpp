#include<iostream>
using namespace std;

int main (){ //1. main program
	int pil, pil2, pil3, i, j; //2. variabel= pil, 3. tipe data =  int
	int b, k, x[100][100], y[100][100], jumlah[100][100];
	int data[100], n, jum, rata;
	char ulang;
	do{ //7. do while
	cout<<"==PROGRAM PERHITUNGAN MATRIKS DAN DATA =="<<endl;
	cout<<"|1. Perhitungan Matriks\t\t\t|"<<endl;
	cout<<"|2. Perhitungan Data\t\t\t|"<<endl;
	cout<<"========================================="<<endl;
	cout<<"Pilih Program (1/2): "; cin>>pil;
	cout<<endl;
	system("cls");
	switch(pil){
		case 1:
		cout<<"==Operasi yang Tersedia=="<<endl;
		cout<<"|1. Penjumlahan\t\t|"<<endl;
		cout<<"|2. Pengurangan\t\t|"<<endl;
		cout<<"========================="<<endl;
		cout<<"Pilih Operasi (1/2): "; cin>>pil2;
		system ("cls");
		cout<<"Input jumlah baris (1-100): "; cin>>b;
		cout<<"Input jumlah kolom (1-100): "; cin>>k;
		cout<<endl;
	
		cout<<"Input elemen matriks pertama: "<<endl;
		for(i = 0; i < b; i++) //4. for
       		for(j = 0; j < k; j++){
           		cout << "Masukkan elemen X[" << i + 1 <<"]["<< j + 1 << "]: ";
          		cin >> x[i][j]; //9. array multidimensi
       		}
		cout << endl << "Masukkan elemen matriks ke-2: " << endl;
  		for(i = 0; i < b; ++i)
       		for(j = 0; j < k; ++j){
           		cout << "Masukkan elemen Y[" << i + 1 <<"]["<< j + 1 << "]: ";
           		cin >> y[i][j]; //input
       		}
    	if(pil2==1){ //5. if
    		for(i = 0; i < b; ++i)
       			for(j = 0; j < k; ++j)
            		jumlah[i][j] = x[i][j] + y[i][j];
			
			cout << endl << "Hasil Penjumlahan dua matriks adalah: " << endl;
    		for(i = 0; i < b; ++i)
        		for(j = 0; j < k; ++j){
            		cout << jumlah[i][j] << "  ";
            		if(j == k - 1)
                	cout << endl;
        		}	
		}
		else if(pil2==2){
    		for(i = 0; i < b; ++i)
       			for(j = 0; j < k; ++j)
            		jumlah[i][j] = x[i][j] - y[i][j];
			
			cout << endl << "Hasil Pengurangan dua matriks adalah: " << endl;
    		for(i = 0; i < b; ++i)
        		for(j = 0; j < k; ++j){
            		cout << jumlah[i][j] << "  ";
            		if(j == k - 1)
                	cout << endl;
        		}
    		
		} else {
			cout<<"Operasi yang dipilih tidak tersedia"<<endl;
		}	
		break;
		case 2:
			cout<<"==Operasi yang Tersedia=="<<endl;
			cout<<"|1. Rata-Rata Data\t|"<<endl;
			cout<<"|2. Nilai Min & Max Data|"<<endl;
			cout<<"========================="<<endl;
			cout<<"Pilih Operasi (1/2): "; cin>>pil3;
			system ("cls");
			cout<<"Input jumlah data yang akan dihitung (0-100): "; cin>>n;
			cout <<"Input " << n << " data:" << endl;
   			for (int i = 0; i < n; i++) {
        		cout << "Data ke-" << i + 1 << ": "; cin >> data[i];
			}
			int max = data[0];
			int min = data[0];
			if (pil3==1){
				while (i<n){ //6. while
           			jum += data[i]; //8. array satu dimensi
           			i++;
        		}
        		rata=jum/n;    
				cout<<endl;
    			cout<<"Nilai Total = "<<jum<<endl;
    			cout<<"Nilai Rata-rata = "<<rata<<endl;
			} else if (pil3==2){
    			for (int i = 1; i < n; i++) {
        			if (data[i] > max) {
           				max = data[i];
        			}
					if (data[i] < min) {
            		min = data[i];
        			}
    			}
    			cout << "Nilai maksimum: " << max << endl;
    			cout << "Nilai minimum: " << min << endl;	
			}
			break;
	}
	cout<<"Ingin mengulang menu lain (y/n)?"; cin>>ulang;
	system ("cls");
	}
	while (ulang!= 'n');
	cout<<"Terima kasih"<<endl;

}
