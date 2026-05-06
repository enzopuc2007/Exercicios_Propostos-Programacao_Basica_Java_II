TITLE NEW PROGRAM 
.MODEL SMALL 
.DATA
MSG1 DB 'Insira um caracter: $'
.CODE
    MAIN PROC 
        MOV AX,@DATA
        MOV DS,AX

        MOV AH,09
        LEA DX,MSG1
        INT 21h

        MOV AH,01
        INT 21h

        MOV DL,AL

        MOV AH,02
        INT 21h

        MOV AH,4Ch
        INT 21h
    MAIN ENDP
END MAIN