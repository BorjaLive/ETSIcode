/*
 * This is sample code generated by rpcgen.
 * These are only templates and you can use them
 * as a guideline for developing your own functions.
 */

#include "calculadora.h"

int *sumar_1_svc(entrada *argp, struct svc_req *rqstp) {
    static int result;

    result = argp->arg1 + argp->arg2;

    return &result;
}

int *restar_1_svc(entrada *argp, struct svc_req *rqstp) {
    static int result;

    result = argp->arg1 - argp->arg2;

    return &result;
}

int *multiplicar_1_svc(entrada *argp, struct svc_req *rqstp) {
    static int result;

    result = argp->arg1 * argp->arg2;

    return &result;
}

int *dividir_1_svc(entrada *argp, struct svc_req *rqstp) {
    static int result;

    result = argp->arg1 / argp->arg2;

    return &result;
}

int *operacion_1_svc(entrada_c *argp, struct svc_req *rqstp) {
    static int result;

    switch (argp->operador) {
        case '+':
        case 'S':
        case 's':
            result = argp->arg1 + argp->arg2;
            break;
        case '-':
        case 'R':
        case 'r':
            result = argp->arg1 - argp->arg2;
            break;
        case '*':
        case 'M':
        case 'm':
            result = argp->arg1 * argp->arg2;
            break;
        case '/':
        case 'd':
        case 'D':
            result = argp->arg1 / argp->arg2;
            break;
        default:
            result = 0;
    };
    printf("SERVIDOR: Realizado %d %c %d = %d\n", argp->arg1, argp->operador, argp->arg2, result);

    return &result;
}