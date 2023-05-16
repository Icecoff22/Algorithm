#include<iostream>

using namespace std;

int main(){
    int kx, ky, sx, sy, N;
    string K, S, dir;
    string res_K, res_S;
    cin >> K >> S >> N;
    kx = K[0]-'A'+1;
    ky = K[1]-'0';
    sx = S[0]-'A'+1;
    sy = S[1]-'0';
    for(int i=0;i<N;i++){
        cin >> dir;        
        if(dir=="R"){
            kx+=1;           
            if(kx==sx&&ky==sy&&sx+1>8||kx>8)
                kx-=1;
            else if(kx==sx&&ky==sy)
                sx+=1;

        }
        else if(dir=="L"){
            kx-=1;
            if(kx==sx&&ky==sy&&sx-1<1||kx<1)
                kx+=1;
            else if(kx==sx&&ky==sy)
                sx-=1;
        }
        else if(dir=="B"){
            ky-=1;
            if(kx==sx&&ky==sy&&sy-1<1||ky<1)
                ky+=1;
            else if(kx==sx&&ky==sy)
                sy-=1;
        }
        else if(dir=="T"){
            ky+=1;
            if(kx==sx&&ky==sy&&sy+1>8||ky>8)
                ky-=1;
            else if(kx==sx&&ky==sy)
                sy+=1;
        }
        else if(dir=="RT"){
            kx+=1;
            ky+=1;
            if(kx==sx&&ky==sy&&(sy+1>8||sx+1>8)||ky>8||kx>8){
                kx-=1;
                ky-=1;
            }
            else if(kx==sx&&ky==sy){
                sx+=1;
                sy+=1;
            }
        }
        else if(dir=="LT"){
            kx-=1;
            ky+=1;
            if(kx==sx&&ky==sy&&(sy+1>8||sx-1<1)||ky>8||kx<1){
                kx+=1;
                ky-=1;
            }
            else if(kx==sx&&ky==sy){
                sx-=1;
                sy+=1;
            }
        }
        else if(dir=="RB"){
            kx+=1;
            ky-=1;
            if(kx==sx&&ky==sy&&(sy-1<1||sx+1>8)||ky<1||kx>8){
                kx-=1;
                ky+=1;
            }
            else if(kx==sx&&ky==sy){
                sx+=1;
                sy-=1;
            }
        }
        else if(dir=="LB"){
            kx-=1;
            ky-=1;
            if(kx==sx&&ky==sy&&(sy-1<1||sx-1<1)||ky<1||kx<1){
                kx+=1;
                ky+=1;
            }
            else if(kx==sx&&ky==sy){
                sx-=1;
                sy-=1;
            }
        }
    }
    res_K=(char)(kx+'A'-1)+to_string(ky);
    res_S=(char)(sx+'A'-1)+to_string(sy);
    cout << res_K << '\n' << res_S;
}
