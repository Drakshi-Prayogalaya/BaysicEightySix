package com.grape.basic8086;

public class ProgramData
{
    static String program1 = ";Add 2 numbers of word length.\n" +
            "\n" +
            "" +
            ".model small\n" +
            ".data\n" +
            "a1 dw  0001h\n" +
            "a2   dw 0002h\n" +
            "a3   dw   ? \n" +
            ".code\n" +
            "start:MOV ax, @data\n" +
            "\t\t\tMOV ds, ax\n" +
            "\t\t\tMOV ax, a1 \n" +
            "\t\t\tMOV bx, a2\n" +
            "\t\t\tADD ax, bx \n" +
            "\t\t\tINT 3 \n" +
            "\t\t\tend start\n" +
            "\t\t\tend  \n" +
            "\n" +
            "\n" +
            "Output: \n" +
            "ax= 0001h\n" +
            "bx= 0002h\n" +
            "ax= 0003h\n";

    static String program2 = ";Add 2 numbers of bytes lengths. \n" +
            "\n" +
            ".model small \n" +
            ".data\n" +
            "a1  db 01h\n" +
            "a2 db 02h\n" +
            "a3 db ? \n" +
            ".code\n" +
            "start:MOV ax, @data\n" +
            "\t\t\tMOV ds, ax\n" +
            "\t\t\tMOV al, a1\n" +
            "\t\t\tMOV bl, a2\n" +
            "\t\t\tADD al,bl  \n" +
            "\t\t\tINT 3 \n" +
            "\t\t\tend start \n" +
            "\t\t\tend \n" +
            "\n" +
            "Output: \n" +
            "al=01h\n" +
            "bl=02h\n" +
            "al=03h\n";



    static String program3 = "; Multiply 2 words\n" +
            "\n" +
            ".model small \n" +
            ".data \n" +
            "a1   dw 0001h\n" +
            "a2  dw  0002h\n" +
            "a3  dw ? \n" +
            ".code \n" +
            "start : MOV ax, @data\n" +
            "\t\t\tMOV ds, ax\n" +
            "\t\t\tMOV ax, a1\n" +
            "\t\t\tMOV bx, a2\n" +
            "\t\t\tMOV bx\n" +
            "\t\t\tINT 3\n" +
            "\t\t\tend start\n" +
            "\t\t\tend\n" +
            "\n" +
            "Output : \n" +
            "ax=0001h\n" +
            "bx=0002h\n" +
            "ax=0002h \n";



    static String program4 = "; Addition of 2 bytes with carry. \n" +
            "\n" +
            ".model small\n" +
            ".data\n" +
            "a1  db OOFh\n" +
            "a2 db  12h\n" +
            "a3 dw ? \n" +
            ".code\n" +
            "start: MOV ax,@ data\n" +
            "\t\t\tMOV ds,ax\n" +
            "\t\t\tMOV ah,OOH\n" +
            "\t\t\tMOV al ,a1\n" +
            "\t\t\tMOV bl,a2\n" +
            "\t\t\tADD  al, bl \n" +
            "\t\t\tJNC next\n" +
            "\t\t\tADC ah, OO \n" +
            "next :MOV  a3,ax \n" +
            "\t\t\tend start\n" +
            "\t\t\tend  \n" +
            "\n" +
            "Output: \n" +
            "al=FFh\n" +
            "bl=12h\n" +
            "ax=111h\n";


    static String program5 = ";Addition of 2 bytes stored in memory\n" +
            "\n" +
            ".model small\n" +
            ".code\n" +
            "start: MOV SI, 2000H\n" +
            "\t\t\tMOV AL,[SI] \n" +
            "\t\t\tINC SI\n" +
            "\t\t\tADD AL, [SI] \n" +
            "\t\t\tINC SI \n" +
            "\t\t\tMOV [SI], AL \n" +
            "\t\t\tend start  \n" +
            "\t\t\tend\n" +
            "\n" +
            "Output: \n" +
            "ds: 2000 CDh\n" +
            "ds: 2001 20h\n" +
            "ds: 2002  EDh  \n";


    static String program6 = "; Addition of 2 bytes (immediate ADDressing)\n" +
            "\n" +
            ".model small\n" +
            ".code\n" +
            "start:MOV AH,OOH \n" +
            "\t\t\tMOV AL,OFH\n" +
            "\t\t\tADD AL,OFFH\n" +
            "\t\t\tJNC  next \n" +
            "\t\t\tADC  AH,OO\n" +
            "Next: end start  \n" +
            "\t\t\t\tend \n" +
            "\n" +
            "Output: \n" +
            "AL=OFH  \n" +
            "AL=OEh \n" +
            "Ax=10Eh\n";


    static String program7 = ";Addition of n bytes \n" +
            "\n" +
            ".model small\n" +
            ".code\n" +
            "start: MOV SI,2000H\n" +
            "\t\t\tMOV cl,05H  \n" +
            "\t\t\tMOV al ,00H\n" +
            "LOOP 1: MOV bl,[SI] \n" +
            "\t\t\tADD  al, bl \n" +
            "\t\t\tinc  SI  \n" +
            "\t\t\tdec  CL \n" +
            "\t\t\tJNC  LOOP 1\n" +
            "\t\t\tMOV  [SI],al\n" +
            "\t\t\tend start\n" +
            "\t\t\tend \n" +
            "\n" +
            "Output:  \n" +
            "ds:2000  10  18  50  19  65\n" +
            "ax:F6h  C=0\n";


    static String program8 = ";Addition of n words\n" +
            "\n" +
            ".model small\n" +
            ".code\n" +
            "start: MOV SI, 2000h\n" +
            "\t\t\tMOV ax, 0000h  \n" +
            "\t\t\tMOV cx, 000Sh\n" +
            "LOOP 1:MOV bh,[SI] \n" +
            "\t\t\tinc SI\n" +
            "\t\t\tMOV bl[SI] \n" +
            "\t\t\tADD  ax, bx\n" +
            "\t\t\tInc  SI \n" +
            "\t\t\tdec cx  \n" +
            "\t\t\tJNZ  LOOP 1  \n" +
            "\t\t\tMOV  [SI],ax\n" +
            "\t\t\tend start\n" +
            "\t\t\tend\n" +
            "\n" +
            "Output: \n" +
            "ds:2000  67  75  45  19  65  54  32  10 \n" +
            "ax:43F2h   C=1\n";


    static String program9 = " ;Addition of 2 double words\n" +
            "\n" +
            ".model small\n" +
            ".data\n" +
            "a1  dd 12345678h  \n" +
            "a2  dd 12345678h\n" +
            "sum ? \n" +
            ".code\n" +
            "start:CLC\n" +
            "\t\t\tMOV ax,@data\n" +
            "\t\t\tMOV ds, ax\n" +
            "\t\t\tLEA  SI,a1\n" +
            "\t\t\tLEA  DI,a2\n" +
            "\t\t\tMOV ax,[SI] \n" +
            "\t\t\tADD  ax,[DI] \n" +
            "\t\t\tMOV cx,[SI+2] \n" +
            "\t\t\tADC CX,[DI+2] \n" +
            "\t\t\tJNC  down\n" +
            "\t\t\tMOV  sum+4,01h\n" +
            "down:MOV sum,ax\n" +
            "\t\t\tMOV  sum+2,cx\n" +
            "\t\t\tINT 3\n" +
            "\t\t\tend start \n" +
            "\t\t\tend\n" +
            "\n" +
            "Output: \n" +
            "ax  OACFOh\n" +
            "cx  2468h\n" +
            "Sum  00002468ACFOh  \n";


    static String program10 = ";Addition of 2 BCD numbers of bytes length\n" +
            "\n" +
            ".model small\n" +
            ".data\n" +
            "n1 db  99h\n" +
            "n2 db 99h\n" +
            ".code\n" +
            "start : MOV ax,@data\n" +
            "\t\t\tMOV ds,ax\n" +
            "\t\t\tMOV ah, 00h\n" +
            "\t\t\tMOV bh, ah\n" +
            "\t\t\tMOV al, n1\n" +
            "\t\t\tMOV bl, n2\n" +
            "\t\t\tADD al, bl\n" +
            "\t\t\tDAA\n" +
            "\t\t\tJNC  skip\n" +
            "\t\t\tINC  ah \n" +
            "Skip: MOV  n3,ax \n" +
            "\t\t\tInt  3  \n" +
            "\t\t\tend  start \n" +
            "\t\t\tend\n" +
            "\n" +
            "Output: \n" +
            "ax   0099h\n" +
            "bx   0099h\n" +
            "ax   0198h\n";


    static String program11 = " ;Addition of 2 BCD numbers of word length\n" +
            "\n" +
            ".model small\n" +
            ".data\n" +
            " n1 db 99h,99h\n" +
            "n2 db  99h,99h\n" +
            "sum db  ? \n" +
            ".code\n" +
            "start: MOV ax,@data\n" +
            "\t\t\tMOV ds, ax\n" +
            "\t\t\tMOV  al, n1\n" +
            "\t\t\tMOV bx, ooooh\n" +
            "\t\t\tADD al,n2\n" +
            "\t\t\tDAA\n" +
            "\t\t\tMOV sum,al\n" +
            "\t\t\tMOV cl,sum\n" +
            "\t\t\tMOV ah,n1+1 \n" +
            "\t\t\tADC ah,n2+1\n" +
            "\t\t\tMOV al, ah\n" +
            "\t\t\tDAA\n" +
            "\t\t\tJNC  down\n" +
            "\t\t\tINC bx\n" +
            "down:MOV sum+1,al\n" +
            "\t\t\tMOV ch, sum+1\n" +
            "\t\t\tMOV sum+2,bl\n" +
            "\t\t\tint  3\n" +
            "\t\t\tend start\n" +
            "\t\t\tend\n" +
            "\n" +
            "Output: \n" +
            "ax  3399h\n" +
            "bx  0001h\n" +
            "cx  9998h\n";


    static String program12 = ";Program to square a number\n" +
            "\n" +
            ".model small\n" +
            ".data\n" +
            "n1  db 20h\n" +
            "n2  dw  ? \n" +
            ".code\n" +
            "start: MOV ax,@data\n" +
            "\t\t\tMOV ds, ax\n" +
            "\t\t\tMOV ah,ooh\n" +
            "\t\t\tMOV al,n1\n" +
            "\t\t\tMUL al\n" +
            "\t\t\tMOV  n2,ax\n" +
            "\t\t\tint  3h\n" +
            "\t\t\tend start\n" +
            "\t\t\tend\n" +
            "\n" +
            "output: \n" +
            "ax  0020h\n" +
            "ax  0400h\n";


    static String program13 = ";Program to cube a number\n" +
            "\n" +
            ".model  small\n" +
            ".data\n" +
            "n1 dw  0020h\n" +
            "n2 dw   ? \n" +
            ".code\n" +
            "start:MOV ax,@data\n" +
            "\t\t\tMOV ds,ax\n" +
            "\t\t\tMOV ah, ooh\n" +
            "\t\t\tMOV  ax,n1\n" +
            "\t\t\tMOV  bx,n1\n" +
            "\t\t\tMUL ax\n" +
            "\t\t\tMUL  bx\n" +
            "\t\t\tMOV  n2,ax\n" +
            "\t\t\tINT 3h\n" +
            "\t\t\tend start\n" +
            "\t\t\tend\n" +
            "output: \n" +
            "ax 0020h\n" +
            "bx 0020h\n" +
            "ax 8000h\n";


    static String program14 = ";Program to transfer n bits of data from one location to another\n" +
            "\n" +
            ".model small\n" +
            ".code\n" +
            "start:MOV SI,2000h\n" +
            "\t\t\tMOV DI,4000h\n" +
            "\t\t\tMOV  CL,O5h\n" +
            "LOOP: MOV bl, [SI] \n" +
            "\t\t\tMOV [DI],bl\n" +
            "\t\t\tINC  SI\n" +
            "\t\t\tINC  DI\n" +
            "\t\t\tDEC  CL \n" +
            "\t\t\tJNC LOOP 1\n" +
            "\t\t\tINT 3\n" +
            "\t\t\tend  start\n" +
            "\t\t\tend\n" +
            "\n" +
            "output: \n" +
            "ds: 2000  01  02  03  04  \n" +
            "ds: 4000  09  08  07  02  07\n" +
            "after transfer\n" +
            "ds: 2000  01  02  03  04  05\n" +
            "ds: 4000  01  02  03  04  05\n";


    static String program15 = ";Program to swap contents\n" +
            "\n" +
            ".model small\n" +
            ".data\n" +
            "n1 01h  02h  03h  04h  05h\n" +
            "n2 11h  12h  13h  14h  15h\n" +
            ".code\n" +
            "start:MOV  ax,@data\n" +
            "\t\t\tMOV  ds,ax\n" +
            "\t\t\tMOV  cl,05h \n" +
            "\t\t\tLEA SI, n1\n" +
            "\t\t\tLEA DI, n2\n" +
            "Loop 1:MOV  al ,[dI] \n" +
            "\t\t\tMOV ah,[SI] \n" +
            "\t\t\tMOV [dI],ah\n" +
            "\t\t\tMOV [SI],al\n" +
            "\t\t\tINC SI\n" +
            "\t\t\tINC DI\n" +
            "\t\t\tDEC CL\n" +
            "\t\t\tJNZ LOOP 1\n" +
            "\t\t\tInt 3\n" +
            "\t\t\tend start\n" +
            "\t\t\tend \n" +
            "\n" +
            "Output: \n" +
            "ds:000E  01  02  03  04  05\n" +
            "ds:0014  11  12  13  14  15\n" +
            "After  swaping\n" +
            "ds:000E  11  12  13  14  15\n" +
            "ds:0014  01  02  03  04  05\n";


    static String program16 = ";Division of 2 bytes\n" +
            "\n" +
            ".model small\n" +
            ".data\n" +
            "n1 dw 0020h\n" +
            "n2 db 03h\n" +
            "n3 db ? \n" +
            ".code\n" +
            "start : MOV  ax,@ data\n" +
            "\t\t\tMOV  ds, ax\n" +
            "\t\t\tMOV  ax, n1\n" +
            "\t\t\tMOV  bl, n2\n" +
            "\t\t\tDIV  bl\n" +
            "\t\t\tMOV  n3,al \n" +
            "\t\t\tint  3 \n" +
            "\t\t\tend  start \n" +
            "\t\t\tend \n\n" +
            "output\n" +
            "ax 0020h\n" +
            "bx 0003h\n" +
            "ax 0206h\n";


    static String program17 = ";Division  of a word by a byte\n" +
            "\n" +
            ".model small\n" +
            ".data\n" +
            "n1  dw OFFFFh\n" +
            "n2  db 06h\n" +
            ".code\n" +
            "start:  MOV ax,@ data\n" +
            "\t\t\tMOV ds, ax\n" +
            "\t\t\tMOV bh, ooh \n" +
            "\t\t\tMOV ax, n1\n" +
            "\t\t\tMOV bl,n2  \n" +
            "\t\t\tDIV  bx\n" +
            "\t\t\tINT 3\n" +
            "\t\t\tend start\n" +
            "\t\t\tend \n\n" +
            "output\n" +
            "ax  FFFFh\n" +
            "bx  0006h  \n" +
            "ax 2AAAh\n" +
            "dx 0003h\n";


    static String program18 = ";Program to find largest of n bytes\n" +
            "\n" +
            ".model small\n" +
            ".code\n" +
            "start:MOV  cl, 04h\n" +
            "\t\t\tMOV SI, 2000h\n" +
            "\t\t\tMOV  al,[SI] \n" +
            "back:INC  SI\n" +
            "\t\t\tCMP  al,[SI] \n" +
            "\t\t\tJNC next\n" +
            "\t\t\tMOV  al,[SI] \n" +
            "next: LOOP back \n" +
            "\t\t\tINT 3\n" +
            "\t\t\tend start\n" +
            "\t\t\tend\n" +
            "\n" +
            "output: \n" +
            "ds: 2000  01  0A  EF  87 5E FF\n" +
            "ax: 00EFh\n";


    static String program19 = ";Program to find smallest of n bytes\n" +
            "\n" +
            ".model small\n" +
            ".code\n" +
            "start: MOV  CL,04h\n" +
            "\t\t\tMOV  SI, 2000h\n" +
            "\t\t\tMOV  al ,[SI] \n" +
            "back :INC SI \n" +
            "\t\t\tCMP  al,[SI] \n" +
            " \t\t\tJB  next   \n" +
            "\t\t\tMOV al,[SI] \n" +
            "next:LOOP  back\n" +
            "\t\t\tint  3\n" +
            "\t\t\tend start\n" +
            "\t\t\tend\n" +
            "\n" +
            "output: \n" +
            "ds:2000 09 09 03 04 02 01\n" +
            "ax:0002h\n";


    static String program20 = ";Factorial of a number\n" +
            "\n" +
            ".model small\n" +
            ".data\n" +
            "n1  db  05h\n" +
            "n2  dw  ? \n" +
            ".code\n" +
            "start:MOV  ax ,@ data\n" +
            "\t\t\tMOV ds,ax\n" +
            "\t\t\tMOV al,n1  \n" +
            "\t\t\tDEC n1  \n" +
            "Loop: MOV bl,n1\n" +
            "\t\t\tMUL  bl\n" +
            "\t\t\tDEC n1  \n" +
            "\t\t\tJNZ  LOOP 1\n" +
            "\t\t\tMOV n2 ,ax\n" +
            "\t\t\tINT 3\n" +
            "\t\t\tend start\n" +
            "\t\t\tend\n\n" +
            "output: \n" +
            "ax 0005h\n" +
            "ax 0078h\n";


    static String program21 = ";Average of 2 bytes\n" +
            "\n" +
            ".model small\n" +
            ".data\n" +
            "a db 1Bh\n" +
            "b db 45h\n" +
            "c db 02h\n" +
            "d db  ? \n" +
            ".code\n" +
            "start:MOV ax,@ data\n" +
            "\t\t\tMOV ds,ax\n" +
            "\t\t\tMOV ah,ooh\n" +
            "\t\t\tMOV al, a  \n" +
            "\t\t\tMOV bl, b\n" +
            "\t\t\tADD al,bl\n" +
            "\t\t\tJNC next\n" +
            "\t\t\tADC ah,oo\n	 " +
            " next:DIV C\n" +
            "\t\t\tMOV d,al\n" +
            "\t\t\tend start\n" +
            "\t\t\tend\n" +
            "\n" +
            "output: \n" +
            "ax  001Bh\n" +
            "bx  0045h\n" +
            "ax  0030h\n" +
            "dx  0000h\n";


    static String program22 = ";Average of 2 words\n" +
            "\n" +
            ".model  small\n" +
            ".data\n" +
            "a  dw 024Bh\n" +
            "b  dw 0124h \n" +
            ".code\n" +
            "start: MOV ax, @data\n" +
            "\t\t\tMOV  ds,ax\n" +
            "\t\t\tMOV  cx,0002h\n" +
            "\t\t\tMOV  ax, a\n" +
            "\t\t\tADD  ax,b\n" +
            "\t\t\tDIV  CX\n" +
            "\t\t\tint  3\n" +
            "\t\t\tend start\n" +
            "\t\t\tend\n" +
            "\n" +
            "output\n" +
            "ax  01B7h\n" +
            "dx  0001h\n";


    static String program23 = "; To separate even and odd numbers in array of N bytes.\n" +
            "\n" +
            ".model small\n" +
            ".data\n" +
            "array db  12h,23h,26h,63h,25h,36h,2Fh,33h,10h,35h\n" +
            ".code\n" +
            "start:MOV  ax,@data\n" +
            "\t\t\tMOV  ds,ax\n" +
            "\t\t\tMOV  cl,10\n" +
            "\t\t\tMOV  SI,2000h\n" +
            "\t\t\tMOV DI,2008h\n" +
            "\t\t\tLEA  BP,array\n" +
            "Back:  MOV  AL,DS:[BP] \n" +
            "\t\t\tMOV  BL,AL\n" +
            "\t\t\tAND  AL,01H\n" +
            "\t\t\tJZ  next\n" +
            "\t\t\tMOV [DI],bl\n" +
            "\t\t\tINC DI\n" +
            "\t\t\tJMP  skip\n" +
            "next: MOV [SI],bl\n" +
            "\t\t\tINC  SI\n" +
            "Skip: INC  BP\n" +
            "\t\t\tDEC  CL\n" +
            "\t\t\tJNZ  back\n" +
            "\t\t\tend  start\n" +
            "\t\t\tend\n" +
            "\n" +
            "output: \n" +
            "ds:2000 12 26 36 10\n" +
            "ds:2008 23 3F 25 2F 33 35\n";


    static String program24 = " ;Program  to  check  if  string  is  palindrome  or  not\n" +
            "\n" +
            ".model  small\n" +
            ".data\n" +
            "m1  db  10,13, 'Enter  a string' ,'$' \n" +
            "m2  db  10,13, 'string  is  palindrome' ,'$' \n" +
            "m3  db  10,13, 'string  is not  palindrome' , '$' \n" +
            "BUFF db  80\n" +
            "\t\t\tdb  0\n" +
            "\t\t\tdb  80  dup(0) \n" +
            ".code\n" +
            "start:MOV  ax,@data\n" +
            "\t\t\tMOV ds,ax\n" +
            "\t\t\tMOV ah,09h\n" +
            "\t\t\tMOV  dx,offset  m1\n" +
            "\t\t\tINT  21h\n" +
            "\t\t\tMOV  ah,OAh\n" +
            "\t\t\tLEA  dx,BUFF\n" +
            "\t\t\tINT  21h\n" +
            "\t\t\tLEA  bx, buff+2\n" +
            "\t\t\tMOV  ch,ooh\n" +
            "\t\t\tMOV  cl,buff+1\n" +
            "\t\t\tMOV  di,Cx\n" +
            "\t\t\tDEC  di\n" +
            "\t\t\tSAR  cl,1\n" +
            "\t\t\tMOV SI,0000h\n" +
            "back: MOV  al,[bx+di] \n" +
            "\t\t\tMOV ah,[bx+si] \n" +
            "\t\t\tCMP  al,ah\n" +
            "\t\t\tJNZ  last\n" +
            "\t\t\tDEC  di\n" +
            "\t\t\tINC  si\n" +
            "\t\t\tDEC  cl\n" +
            "\t\t\tJNZ  back\n" +
            "\t\t\tMOV  ah,09h\n" +
            "\t\t\tLEA  dx,m2\n" +
            "\t\t\tINT  21h \n" +
            "\t\t\tJMP  ter  \n" +
            "Last:MOV  9h,09h  \n" +
            "\t\t\tLEA  dx,m3\n" +
            "\t\t\tINT 21h   \n" +
            "Ter:MOV  ah,hch\n" +
            "\t\t\tINT  21h  \n" +
            "\t\t\tend  start \n" +
            "\t\t\tend \n\n" +
            "output: \n" +
            "Enter  string:MADAM   \n" +
            "string is  palindrome\n" +
            "Enter  string:SJCE \n" +
            "string is  not palindrome \n";


    static String program25 = ";Program  to  arrange  16  bit  unsigned  number in ascending  order\n" +
            "\n" +
            ".model small\n" +
            ".data\n" +
            "num dw 0052h,0014h,0068h,0038h\n" +
            ".code\n" +
            "start :MOV  ax,@data\n" +
            "\t\t\tMOV  ds ,ax\n" +
            "\t\t\tMOV  ax,2\n" +
            "loop2:MOV  cx,dx\n" +
            "\t\t\tDEC cx\n" +
            "\t\t\tMOV SI,cx\n" +
            "\t\t\tADD  SI,SI\n" +
            "\t\t\tMOV  ax,num[SI] \n" +
            "loop1:CMP  num[SI-2],ax\n" +
            "\t\t\tJBC  next\n" +
            "\t\t\tMOV  dI,num [SI-2] \n" +
            "\t\t\tMOV num[SI],dI\n" +
            "\t\t\tDEC SI\n" +
            "\t\t\tDEC  SI\n" +
            "\t\t\tJNZ  loop1\n" +
            "next:MOV  num[SI],ax\n" +
            "\t\t\tINC  dx \n" +
            "\t\t\tCMP  dx,4  \n" +
            "\t\t\tJBC  loop2\n" +
            "\t\t\tMOV  ah,4ch\n" +
            "\t\t\tINT  21h\n" +
            "\t\t\tend  start\n" +
            "\t\t\tend\n" +
            "\n" +
            "output\n" +
            "0014 0038  0052  0068\n";


    static String program26 = " ; Program to sort an array in descending order\n" +
            "\n" +
            ".model  small\n" +
            ".stack\n" +
            ".data\n" +
            " num  db  12h,45h,79h,65h\n" +
            ".code\n" +
            "start:MOV  ax,@ data\n" +
            "\t\t\tMOV  ds,ax\n" +
            "\t\t\tMOV  bx,3\n" +
            "loop2:MOV  cx,bx\n" +
            "\t\t\tMOV  di,oh\n" +
            "\t\t\tMOV  al,num[di] \n" +
            "\t\t\tMOV  dx,di\n" +
            "loop1 :INC  di\n" +
            "\t\t\tCMP  al,num[di] \n" +
            "\t\t\tJB  next\n" +
            "\t\t\tMOV  al ,num[di] \n" +
            "\t\t\tMOV  dx,di\n" +
            "next:LOOP  loop1\n" +
            "\t\t\txchg  al ,num[di] \n" +
            "\t\t\tMOV  num[dx],al\n" +
            "\t\t\tDEC  bx\n" +
            "\t\t\tJNZ  loop2 \n" +
            "\t\t\tMOV  ah,4ch\n" +
            "\t\t\tINT  21h\n" +
            "\t\t\tend  start\n" +
            "\t\t\tend\n\n" +
            "output: \n" +
            "79  65  45  12\n";


    static String program27 = "; Program  to  display  Fibonacci  series\n" +
            "\n" +
            ".model  small\n" +
            ".data\n" +
            "n1  db  00h\n" +
            "n2  db  01h\n" +
            ".code\n" +
            "start:MOV  ax,@data\n" +
            "\t\t\tMOV  ds,ax\n" +
            "\t\t\tMOV  ax,0000h\n" +
            "\t\t\tMOV  cx,0009h\n" +
            "\t\t\tMOV  al,n1\n" +
            "\t\t\tMOV  dl,n1\n" +
            "\t\t\tDEC  cx\n" +
            "\t\t\tMOV  al,n2 \n" +
            "\t\t\tDEC  cx\n" +
            "\t\t\tMOV  dl,n2\n" +
            "loop1:ADD  al,bl\n" +
            "\t\t\tMOV  dl,al\n" +
            "\t\t\tMOV  al,bl\n" +
            "\t\t\tMOV  bl,dl \n" +
            "\t\t\tDec  cx \n" +
            "\t\t\tJNZ loop1\n	" +
            "\t\t\tINT  03h	  \n" +
            "\t\t\tend  start\n" +
            "\t\t\tend\n" +
            "\n" +
            "output: \n" +
            "cx  0009  0008  0007  0006  0005\n" +
            "Dx 0000  0001  0001  0002  0003\n" +
            "0004  0003  0002  0001  0000\n" +
            "0005  0008  000D  0015  0015 \n";


    static String program28 = ";Program  to  search  a  character  in  a  string\n" +
            "\n" +
            ".model  small\n" +
            ".data\n" +
            "String  db  \"SJCE\" \n" +
            "Char  db  \"E\" \n" +
            ".code\n" +
            "start: MOV  ax,@data\n" +
            "\t\t\tMOV  ds,ax\n" +
            "\t\t\tMOV  ax,00h\n" +
            "\t\t\tMOV  cx,00h\n" +
            "\t\t\tLEA  SI,string\n" +
            "Up: MOV  al,[SI] \n" +
            "\t\t\tCMP  al,char \n" +
            "\t\t\tJZ  found\n" +
            "\t\t\tINC  SI\n" +
            "\t\t\tDEC  cx\n" +
            "\t\t\tJNZ  up\n" +
            "\t\t\tJMP  skip\n" +
            "Found:MOV  bx,IIIIh\n" +
            "Skip:INT  3h\n" +
            "\t\t\tend  start\n" +
            "\t\t\tend\n" +
            "\n" +
            "output: \n" +
            "bx   IIIIh\n";


    static String program29 = " ; To convert  data  from  binary  to  BCD\n" +
            "\n" +
            ".model  small\n" +
            ".data\n" +
            "n1  db  39h\n" +
            "n2  db  0Ah\n" +
            "n3  dw  ? \n" +
            ".code\n" +
            "start: MOV  ax,@data\n" +
            "\t\t\tMOV  ds,ax\n" +
            "\t\t\tMOV  ah,ooh\n" +
            "\t\t\tMOV  al,n1\n" +
            "\t\t\tDIV  n2 \n" +
            "\t\t\tXCHG  ah,al \n" +
            "\t\t\tMOV  n3,ax\n" +
            "\t\t\tend  start \n" +
            "\t\t\tend\n" +
            "\n" +
            "output\n" +
            "ax  0507\n";


    static String program30 = " ;To  convert  data  from  BCD  to  binary\n" +
            "\n" +
            ".model small\n" +
            ".data\n" +
            "n1  dw  0309h\n" +
            "n2 dw ? \n" +
            ".code\n" +
            "start:MOV  ax,@data\n" +
            "\t\t\tMOV  ds,ax\n" +
            "\t\t\tMOV  ax,n1\n" +
            "\t\t\tAAD\n" +
            "\t\t\tMOV  n2 ,ax \n" +
            "\t\t\tend  start  \n" +
            "\t\t\tend\n" +
            "\n" +
            "output: \n" +
            "ax 0027h\n";


    static String program31 = "; To  convert  data  from  ASCII  to  BCD\n" +
            "\n" +
            ".model  small\n" +
            ".code\n" +
            "start:MOV  ax,3633h\n" +
            "\t\t\tSUB  ax,3030h\n" +
            "\t\t\tMOV  cl,04h\n" +
            "\t\t\tMOV  bl,al\n" +
            "\t\t\tMOV bh,ooh\n" +
            "\t\t\tAND  ax,OFFOOh\n" +
            "\t\t\tROR  ax,cl \n" +
            "\t\t\tADD  ax,bx\n" +
            "\t\t\tend  start\n" +
            "\t\t\tend\n\n" +
            "output: \n" +
            "ax 0063\n";


    static String program32 = ";To  convert  data  from  BCD  to  ASCII\n" +
            "\n" +
            ".model small\n" +
            ".code\n" +
            "start:MOV  al,12\n" +
            "\t\t\tMOV  ah,ooh\n" +
            "\t\t\tAAM\n" +
            "\t\t\tADD  ax,3030h \n" +
            "\t\t\tend  start \n" +
            "\t\t\tend\n" +
            "\n" +
            "output: \n" +
            "ax  3132\n";


    static String program33 = " ; To  find  square  of  number  using  look  up  table\n" +
            "\n" +
            ".model  small\n" +
            ".data\n" +
            "table 1  db  00h,01h,04h,09h,10h,19h,24h,31h,40h,51h\n" +
            ".code\n" +
            "start:MOV  ax,@data\n" +
            "\t\t\tMOV  ds,ax\n" +
            "\t\t\tMOV  ah,00h\n" +
            "\t\t\tMOV  al,07h\n" +
            "\t\t\tLEA  bx,table 1  \n" +
            "\t\t\tXLAT  table 1 \n" +
            "\t\t\tend  start\n" +
            "\t\t\tend\n" +
            "\n" +
            "output\n" +
            "ax  0031h\n";


    static String program34 = " ;To  find 7 segment  equivalent  to  BCD  number  using  look  up  table\n" +
            "\n" +
            ".model  small\n" +
            ".data\n" +
            "table1 db 3Fh,06h,5Bh,4Fh,66h,6Dh,7Dh,07h,7Fh,6Fh\n" +
            ".code\n" +
            "start:MOV  ax,@data\n" +
            "\t\t\tMOV  ds,ax\n" +
            "\t\t\tMOV  ah,00h\n" +
            "\t\t\tMOV  al,02h\n" +
            "\t\t\tLEA  bx,table1\n" +
            "\t\t\tXLAT  table1  \n" +
            "\t\t\tint  3h \n" +
            "\t\t\tend  start\n" +
            "\t\t\tend\n\n" +
            "output: \n" +
            "ax 005Bh\n";


    static String program35 = ";To find  GCD  and  LCM  of  2  bytes\n" +
            "\n" +
            ".model  small\n" +
            ".data\n" +
            "a  db  02h\n" +
            "b  db  04h\n" +
            ".code\n" +
            "start:MOV  ax,@data\n" +
            "\t\t\tMOV  ds,ax\n" +
            "\t\t\tMOV  SI,2000h\n" +
            "\t\t\tMOV  DI,2008h\n" +
            "\t\t\tMOV  al,a\n" +
            "\t\t\tMOV bl,b\n" +
            "L1:CMP  al,bl\n" +
            "\t\t\tJZ  L4\n" +
            "\t\t\tJC  L3\n" +
            "L2:SUB  al,bl\n" +
            "\t\t\tJMP  L1\n" +
            "L3:XCHG al,bl\n" +
            "\t\t\tJMP L2\n" +
            "L4:MOV [SI],ai\n" +
            "\t\t\tMOV  ah,00h\n" +
            "\t\t\tMOV bh,00h\n" +
            "\t\t\tMOV  bl,b\n" +
            "\t\t\tMUL  bx\n" +
            "\t\t\tMOV  cx,[SI] \n" +
            "\t\t\tDIV  cx\n" +
            "\t\t\tMOV [DI],ax\n" +
            "\t\t\tINT  3h\n" +
            "\t\t\tend  start\n" +
            "\t\t\tend\n" +
            "\n" +
            "output\n" +
            "ds:2000 02\n" +
            "ds: 2008  04  \n";


    static String program36 = ";To add two  2x2 matrices\n" +
            "\n" +
            ".model  small\n" +
            ".data\n" +
            "n1  db  1,2,3,4\n" +
            "n2  db  1,2,3,4\n" +
            "n3 db  4dup(0) \n" +
            ".code\n" +
            "start: MOV ax,@data\n" +
            "\t\t\tMOV  ds,ax\n" +
            "\t\t\tMOV  ah,00h\n" +
            "\t\t\tMOV  cl,04h\n" +
            "\t\t\tLEA  SI,n1\n" +
            "\t\t\tLEA  bx,n2\n" +
            "\t\t\tMOV  DI,2000\n" +
            "up:MOV  al,[SI] \n" +
            "\t\t\tMOV dl,[bx] \n" +
            "\t\t\tADD al,dl\n" +
            "\t\t\tMOV  [DI],al\n" +
            "\t\t\tINC  SI\n" +
            "\t\t\tINC  bx\n" +
            "\t\t\tINC  DI\n" +
            "\t\t\tLOOP up\n" +
            "\t\t\tINT 3h \n" +
            "\t\t\tend  start \n" +
            "\t\t\tend\n\n" +
            "output\n" +
            "ds:2000  02  04  06  08\n";


    static String program37 = ";To  find  the  product  of 2 matrices\n" +
            "\n" +
            "ASSUME  CS:code,DS:data\n" +
            "data  segment\n" +
            "rocol  equ  03h\n" +
            "mat1  db  05h,09h,0Ah,03h,02h,07h,01h,00h,08h\n" +
            "mat2  db  09h,02h,02h,01h,00h,02h,08h,06h,03h\n" +
            "mat3  dw  09h  dup(?)\n" +
            "data  ends\n" +
            "code  segment\n" +
            "start:MOV  ax,data\n" +
            "\t\t\tMOV  ds,ax\n" +
            "\t\t\tMOV  ch,rocol\n" +
            "\t\t\tMOV  bx,offset  mat3\n" +
            "\t\t\tMOV  SI,offset  mat1\n" +
            "next  row:MOV  DI,offset  mat2\n" +
            "\t\t\tMOV  cl,rocol\n" +
            "next  col:MOV  dl,rocol\n" +
            "\t\t\tMOV  bp,0000h\n" +
            "\t\t\tMOV  ax,0000h\n" +
            "\t\t\tSAHF\n" +
            "next_ele: MOV  al,[SI] \n" +
            "\t\t\tMUL  byte  ptr[DI] \n" +
            "\t\t\tADD  bp,ax\n" +
            "\t\t\tINC  SI\n" +
            "\t\t\tADD  DI,03h\n" +
            "\t\t\tDEC dl\n" +
            "\t\t\tJNZ  next_ele\n" +
            "\t\t\tSUB  DI,08h\n" +
            "\t\t\tSUB  SI,03h\n" +
            "\t\t\tMOV  [bx],bp" +
            "\t\t\tADD  bx,02h\n" +
            "\t\t\tDEC  cl\n" +
            "\t\t\tJNZ  nextcol\n" +
            "\t\t\tADD  SI,03h  \n" +
            "\t\t\tDEC  ch\n	" +
            "\t\t\tJNZ  nextrow\n" +
            "\t\t\tMOV ah,4ch\n" +
            "\t\t\tINT  21h\n" +
            "\t\t\tend  start\n\n" +
            "output: \n" +
            "0012:86  46  3A  55  30  1F  49" +
            "32  1A\n";


    static String program38 = ";To  check  whether  a  number  is  prime  or  not\n" +
            "\n" +
            ".model  small\n" +
            ".data\n" +
            "n  db  64h\n" +
            ".code\n" +
            "start:  MOV  ax,@data\n" +
            "\t\t\tMOV ds,ax\n" +
            "\t\t\tMOV  ah,00h\n" +
            "\t\t\tMOV  al,n\n" +
            "back: SHR  ax,01h\n" +
            "\t\t\tMOV  bl,02h\n" +
            "\t\t\tdiv  bl\n" +
            "\t\t\tCMP  ah,00h\n" +
            "\t\t\tJC  next\n" +
            "\t\t\tCMP al,01h\n" +
            "\t\t\tJC  next1\n" +
            "\t\t\tLOOP  back\n" +
            "next: MOV  dx,0FFFFh\n" +
            "\t\t\tJMP  exit\n" +
            "next1: MOV  dx,0AAAAh \n" +
            "\t\t\texit: INT 3h\n" +
            "\t\t\tend  start\n" +
            "\t\t\tend\n\n" +
            "output: \n" +
            "dx AAAA\n";

    static String program39 = " ;To  count  number  of  1's  and 0's  in  given  data\n" +
            "\n" +
            ".model  small\n" +
            ".data\n" +
            "n1 db  31h\n" +
            "ones  db  1dup(0) \n" +
            "zeros  db  1dup(0) \n" +
            ".code\n" +
            "start:MOV  ax,@data\n" +
            "\t\t\tMOV  ds,ax\n" +
            "\t\t\tMOV  cl,08h\n" +
            "\t\t\tMOV  ah,00h\n" +
            "\t\t\tMOV  al,n1\n" +
            "\t\t\tMOV  dx,0000h\n" +
            "up:RCL  al,01h\n" +
            "\t\t\tJC  next\n" +
            "\t\t\tINC  dl\n" +
            "\t\t\tJMP  down  \n" +
            "next:INC  dh  \n" +
            "\t\t\tdown: LOOP  up\n" +
            "\t\t\tMOV  ones,dh\n" +
            "\t\t\tMOV  zeros,dl\n" +
            "\t\t\tINT  3h\n" +
            "\t\t\tend  start\n" +
            "\t\t\tend\n" +
            "\n" +
            "output: \n" +
            "dx  0305\n";


    static String program40 = " ;To  display  string  in lowercase \n" +
            "\n" +
            ".model  small\n" +
            ".data\n" +
            "n1 db  'Enter  the  string',odh,oah, '$' \n" +
            "n2  db  'The  lower  string  is',odh,oah, '$' \n" +
            "buffer  db  80\n" +
            "\t\t\tdb  00\n" +
            "\t\t\tdb  80 dup(0) \n" +
            ".code\n" +
            "start:MOV  ax,@data\n" +
            "\t\t\tMOV  ds,ax\n" +
            "\t\t\tMOV  ah,09h\n" +
            "\t\t\tMOV  dx,offset  n1\n" +
            "\t\t\tINT  21h\n" +
            "\t\t\tMOV  ah,0Ah\n" +
            "\t\t\tMOV  dx,offset buffer\n" +
            "\t\t\tINT  21h\n" +
            "\t\t\tMOV  ah,09h\n" +
            "\t\t\tMOV  dx,offset  n2\n" +
            "\t\t\tINT  21h\n" +
            "\t\t\tMOV  ch,00h\n" +
            "\t\t\tMOV  cl,buffer+1\n" +
            "\t\t\tMOV  bx,offset  buffer+2\n" +
            "\t\t\tMOV  di,00h\n" +
            "up:MOV  dl,[bx+DI] \n" +
            "\t\t\tCMP  96,dl\n" +
            "\t\t\tJC  next\n" +
            "\t\t\tADD  dl,20h\n" +
            "next:MOV  ah,02h\n" +
            "\t\t\tINT  21h\n" +
            "\t\t\tINC  DI\n" +
            "\t\t\tDEC  cx\n" +
            "\t\t\tJNZ  up \n" +
            "\t\t\tMOV  ah,4ch\n" +
            "\t\t\tINT  21h  \n" +
            "\t\t\tend  start \n" +
            "\t\t\tend\n" +
            "\n" +
            "output: \n" +
            "Enter  the  string\n" +
            "QWeRty\n" +
            "The  lowercase  string  is\n" +
            "qwerty\n";


    static String program41 = " ;To concatenate  two  strings\n" +
            "\n" +
            ".model small\n" +
            ".data\n" +
            "n1  db  'friends', '$' \n" +
            "n2  db  'forever', '$' \n" +
            "n3  db  80dup(0) \n" +
            ".code\n" +
            "start:MOV  ax,@data\n" +
            "\t\t\tMOV  ds,ax\n" +
            "\t\t\tMOV  SI,offset  n1\n" +
            "\t\t\tMOV  bx,offset  n2\n" +
            "\t\t\tMOV cl,07h\n" +
            "up:MOV  dl,[SI] \n" +
            "\t\t\tMOV  ah,02h\n" +
            "\t\t\tINT  21h\n" +
            "\t\t\tINC  SI\n" +
            "\t\t\tLOOP  up\n" +
            "\t\t\tMOV  cl,07h  \n" +
            "\t\t\tup1:MOV  dl,[bx]\n" +
            "\t\t\tMOV  ah,02h\n" +
            "\t\t\tINT  21h\n" +
            "\t\t\tINC  bx\n" +
            "\t\t\tLOOP  up1\n" +
            "\t\t\tMOV  ah,01h\n" +
            "\t\t\tINT  21h\n" +
            "\t\t\tend  start\n" +
            "\t\t\tend\n" +
            "output: \n" +
            "\n"+
            "friends  forever\n";


    static String program42 = ";To  compare  two  strings\n" +
            "\n" +
            ".model  small\n" +
            ".data\n" +
            "n1 db 'qwerty',  '$' \n" +
            "n2  db  'qwerty', '$' \n" +
            "n3  db  'strings  are not  equal', 10,13, '$' \n" +
            "n4  db  'strings  are  equal', 10,13, '$' \n" +
            ".code\n" +
            "start:MOV  ax,@data\n" +
            "\t\t\tMOV ds,ax\n" +
            "\t\t\tMOV  SI,offset  n1\n" +
            "\t\t\tMOV  DI,offset  n2\n" +
            "\t\t\tMOV  ch,00h\n" +
            "\t\t\tMOV  cl,06h\n" +
            "up:MOV  al,[SI] \n" +
            "\t\t\tMOV  ah,[DI] \n" +
            "\t\t\tINC  SI\n" +
            "\t\t\tINC  DI\n" +
            "\t\t\tCMP  al,ah\n" +
            "\t\t\tJNZ  down\n" +
            "\t\t\tLOOP  up\n" +
            "\t\t\tMOV  ah,09h\n" +
            "\t\t\tLEA  dx,n4\n" +
            "\t\t\tINT  21h\n" +
            "\t\t\tJMP  exit\n" +
            "down:MOV  ah,09h \n" +
            "\t\t\tLEA  dx,n3  \n" +
            "\t\t\tINT  21h\n" +
            "exit:MOV  ah,01h\n" +
            "\t\t\tINT  21h\n" +
            "\t\t\tend  start\n" +
            "\t\t\tend\n" +
            "\n" +
            "output: \n" +
            "strings  are  equal\n";


    static String program43 = ";To  find  number  of  vowels  in  a  string\n" +
            "\n" +
            ".model small\n" +
            ".data\n" +
            "n1 db  'ORANGe', '$' \n" +
            "n2  db  'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U', '$' \n" +
            ".code\n" +
            "start:MOV  ax,@ data\n" +
            "\t\t\tMOV  ds,ax\n" +
            "\t\t\tMOV  bx,offset  n1\n" +
            "\t\t\tMOV  SI,offset  n2\n" +
            "\t\t\tMOV  cl,06h\n" +
            "\t\t\tMOV  ch,0Ah\n" +
            "\t\t\tMOV  dx,0000h\n" +
            "back:MOV  al[bx] \n" +
            "\t\t\tINC  bx\n" +
            "\t\t\tCMP  al,[SI] \n" +
            "\t\t\tJZ  next\n" +
            "\t\t\tdec  cl\n" +
            "\t\t\tJNZ  back\n" +
            "\t\t\tLEA  bx,n1\n" +
            "\t\t\tMOV  cl,06h\n" +
            "\t\t\tINC  SI\n" +
            "\t\t\tdec  ch\n" +
            "\t\t\tJNZ  back\n" +
            "\t\t\tJMP  exit \n" +
            "next:INC  dx\n" +
            "\t\t\tCMP  ch,00h \n" +
            "\t\t\tJNZ  back \n" +
            "exit: INT  3h\n" +
            "\t\t\tend  start\n" +
            "\t\t\tend\n" +
            "\n" +
            "output: \n" +
            "dx  0003\n";


    static String program44 = ";Program  to  insert  a  character\n" +
            "\n" +
            ".model  small\n" +
            ".data\n" +
            "n1  db  'mano', '$' \n" +
            "n2 db  80dup(0) \n" +
            ".code\n" +
            "start:MOV  ax,@data\n" +
            "\t\t\tMOV  ds,ax \n" +
            "\t\t\tMOV  bx,offset n1\n" +
            "\t\t\tMOV  SI,offset  n2\n" +
            "\t\t\tMOV  ch,00h\n" +
            "\t\t\tMOV  cl,04h\n" +
            "back:MOV  al,[bx] \n" +
            "\t\t\tCMP  al, 'n'  \n" +
            "\t\t\tJE  next \n" +
            "\t\t\tMOV  [SI],al\n" +
            "\t\t\tINC  bx\n" +
            "\t\t\tINC  SI\n" +
            "\t\t\tDEC  cl\n" +
            "\t\t\tJNZ  back\n" +
            "\t\t\tJMP  exit\n" +
            "Next: MOV  [SI],al\n" +
            "\t\t\tINC  SI\n" +
            "\t\t\tINC  cl\n" +
            "\t\t\tMOV  al, 'g' \n" +
            "\t\t\tMOV [SI],al\n" +
            "\t\t\tINC  SI\n" +
            "\t\t\tINC  BX\n" +
            "\t\t\tLOOP  back\n" +
            "exit: int  3\n" +
            "\t\t\tend  start\n" +
            "\t\t\tend\n\n" +
            "output: \n" +
            "ds:0011  6D  61  6E  67  6F\n" +
            "mango\n";


    static String program45 = ";Program  to  delete  a  character\n" +
            "\n" +
            ".model  small\n" +
            ".data\n" +
            "n1  db  'mango', '$' \n" +
            "n2  db  80 dup(0) \n" +
            ".code \n" +
            "start:MOV  ax,@data\n" +
            "\t\t\tMOV  ds,ax\n" +
            "\t\t\tMOV  Bx,offset  n1\n" +
            "\t\t\tMOV  SI,offset  n2\n" +
            "\t\t\tMOV  ch,00h\n" +
            "\t\t\tMOV  cl,05h\n" +
            "back:MOV  al,[Bx] \n" +
            "\t\t\tCMP  al, 'g' \n" +
            "\t\t\tJE  next\n" +
            "\t\t\tMOV  [SI],al\n" +
            "\t\t\tINC  SI\n" +
            "\t\t\tINC  BX\n" +
            "\t\t\tLOOP  back\n" +
            "\t\t\tJMP  exit\n" +
            "next:INC  bx\n" +
            "\t\t\tMOV  al,[bx] \n" +
            "\t\t\tDEC  cl\n" +
            "\t\t\tMOV  [SI],al\n" +
            "\t\t\tLOOP  back\n" +
            "exit: int  3 \n" +
            "\t\t\tend start\n" +
            "\t\t\tend\n" +
            "\n" +
            "output: \n" +
            "ds:0012  6D  6I 6E  6F  mano\n";


    static String program46 = ";Check  whether  a  given  byte  is  2  out of 5  code  or not.\n" +
            "\n" +
            ".model  small\n" +
            ".code\n" +
            "start:MOV  al,11h\n" +
            "\t\t\tMOV  cl,05h\n" +
            "\t\t\tMOV  bh,00h\n" +
            "\t\t\tMOV  bl,00h\n" +
            "up:ROR  al,01h\n" +
            "\t\t\tJNC  go\n" +
            "\t\t\tINC  bx\n" +
            "go:LOOP  up\n" +
            "\t\t\tCMP  bl,02h \n" +
            "\t\t\tJE  next\n" +
            "\t\t\tMOV  dx,0000h\n" +
            "\t\t\tJMP  exit\n" +
            "next:MOV  dx,0FFFFh\n" +
            "exit: int  3\n" +
            "\t\t\tend  start\n" +
            "\t\t\tend\n" +
            "\n" +
            "output: \n" +
            "dx FFFF\n";


    static String program47 = ";Program to  replace  a  character  in  the  string\n" +
            "\n" +
            ".model  small\n" +
            ".data\n" +
            "n1 db  'mangh', '$' \n" +
            "n2  db  80dup(0) \n" +
            ".code\n" +
            "start:MOV  ax,@data\n" +
            "\t\t\tMOV  ds,ax\n" +
            "\t\t\tMOV  bx,offset  n1\n" +
            "\t\t\tMOV  SI,offset  n2\n" +
            "\t\t\tMOV  cl,05h\n" +
            "\t\t\tMOV  al,[bx] \n" +
            "\t\t\tCMP  al, 'h' \n" +
            "\t\t\tJE  next\n" +
            "\t\t\tMOV  [SI],al\n" +
            "\t\t\tINC  SI \n" +
            "\t\t\tINC  BX \n" +
            "\t\t\tLOOP back\n" +
            "\t\t\tJMP  exit\n" +
            "next:INC  SI\n" +
            "\t\t\tMOV  al,  '0' \n" +
            "\t\t\tMOV [SI],al\n" +
            "\t\t\tINC  SI\n" +
            "\t\t\tINC  BX\n" +
            "\t\t\tLOOP  back\n" +
            "exit: int  3\n" +
            "\t\t\tend start\n" +
            "\t\t\tend\n" +
            "\n" +
            "output: \n" +
            "ds:000E  6D  6I  6E  67  6F  mango\n";
}
