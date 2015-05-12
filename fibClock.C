//fib clck
#include<stdio.h>
#include<time.h>

void set_h_colors(int h_arr[], char clock_color_arr[]);
void set_m_colors(int m_arr[], char clock_color_arr[]);
void set_void_colors(char clock_color_arr[]);
void set_h_m_arrays(int hour, int min, int h_arr[], int m_arr[]);
void reset_h_m_arrays(int h_arr[], int m_arr[], char clock_color_arr[]);
void display_clock_color_arr(char clock_color_arr[]);
void waitfor(unsigned int secs);
int i;

void main(){
/*
*	Declarations
*/
	int hour, min=0;
	int h_arr[5]; // For fib nos. 1,1,2,3,5   initialise all positions to 0
	int m_arr[5];
	char clock_color_arr[5];
	time_t epoch_time;
	struct tm *tm_p;
/*
	Getting system time
*/
	{
		
		epoch_time = time( NULL );
		tm_p = localtime( &epoch_time );
		hour = tm_p->tm_hour;
		if(hour == 0)
			hour = 12;
		if(hour > 12)
			hour = hour - 12;
		min = tm_p->tm_min;
		
		reset_h_m_arrays(h_arr, m_arr, clock_color_arr);
		set_h_m_arrays( hour, min, h_arr, m_arr);
		set_h_colors(h_arr, clock_color_arr);
		set_m_colors(m_arr, clock_color_arr);
		set_void_colors(clock_color_arr);
		
		display_clock_color_arr(clock_color_arr);
		
		if(min%5 == 0){
			waitfor(300);
		}
	}
}
void set_h_colors(int h_arr[], char clock_color_arr[]){
	for(i=0; i<5; i++){
		if(h_arr[i]==1){
			clock_color_arr[i] = 'R';
		}
	}
}

void set_m_colors(int m_arr[], char clock_color_arr[]){
	for(i=0; i<5; i++){
		if(m_arr[i]==1 && clock_color_arr[i]=='R'){
			clock_color_arr[i] = 'B';
		}
		else if(m_arr[i]==1 && clock_color_arr[i]!='R'){
			clock_color_arr[i] = 'G';
		}
	}
}

void set_void_colors(char clock_color_arr[]){
	for(i=0; i<5; i++){
		if(clock_color_arr[i]!='R' && clock_color_arr[i]!='B' && clock_color_arr[i]!='G'){
			clock_color_arr[i] = 'W';
		}
	}
}

void set_h_m_arrays(int hour, int min, int h_arr[], int m_arr[]){
	int fib_mins;
	switch(hour){
		case(1):
			h_arr[0] = 1;
			break;
		case(2):
			h_arr[2] = 1;
			break;
		case(3):
			h_arr[3] = 1;
			break;
		case(4):
			h_arr[0] = 1;
			h_arr[3] = 1;
			break;
		case(5):
			h_arr[4] = 1;
			break;
		case(6):
			h_arr[0]=1;
			h_arr[4]=1;
			break;
		case(7):
			h_arr[2]=1;
			h_arr[4]=1;
			break;
		case(8):
			h_arr[3]=1;
			h_arr[4]=1;
			break;
		case(9):
			h_arr[0]=1;
			h_arr[3]=1;
			h_arr[4]=1;
			break;
		case(10):
			h_arr[2]=1;
			h_arr[3]=1;
			h_arr[4]=1;
			break;
		case(11):
			h_arr[0]=1;
			h_arr[2]=1;
			h_arr[3]=1;
			h_arr[4]=1;
			break;
		case(12):

			h_arr[0]=1;
			h_arr[1] = 1;
			h_arr[2]=1;
			h_arr[3]=1;
			h_arr[4]=1;
			break;
	}

	fib_mins = min/5;

	switch(fib_mins){
		case(1):
			m_arr[0] = 1;
			break;
		case(2):
			m_arr[2] = 1;
			break;
		case(3):
			m_arr[3] = 1;
			break;
		case(4):
			m_arr[0] = 1;
			m_arr[3] = 1;
			break;
		case(5):
			m_arr[4] = 1;
			break;
		case(6):
			m_arr[0]=1;
			m_arr[2]=1;
			m_arr[3]=1;
			break;
		case(7):
			m_arr[2]=1;
			m_arr[4]=1;
			break;
		case(8):
			m_arr[3]=1;
			m_arr[4]=1;
			break;
		case(9):
			m_arr[0]=1;
			m_arr[3]=1;
			m_arr[4]=1;
			break;
		case(10):
			m_arr[2]=1;
			m_arr[3]=1;
			m_arr[4]=1;
			break;
		case(11):
			m_arr[0]=1;
			m_arr[2]=1;
			m_arr[3]=1;
			m_arr[4]=1;
			break;
		case(12):
			m_arr[0]=1;
			m_arr[1]=1;
			m_arr[2]=1;
			m_arr[3]=1;
			m_arr[4]=1;
			break;	
	}
}

void reset_h_m_arrays(int h_arr[], int m_arr[], char clock_color_arr[]){
	for(i =0; i<5; i++){
		h_arr[i] = m_arr[i] = 0;
		clock_color_arr[i] = 'NULL';
	}
}

void display_clock_color_arr(char clock_color_arr[]){
	for(i=0; i<5; i++){
		printf("%c",clock_color_arr[i]);
	}
}

void waitfor(unsigned int secs){
	time_t rettime;
	rettime = time(0) + secs;
	while( time(0) < rettime);
}
