/*
 * Please do not edit this file.
 * It was generated using rpcgen.
 */

#include "calculadora.h"

bool_t
xdr_entrada (XDR *xdrs, entrada *objp)
{
	register int32_t *buf;

	 if (!xdr_int (xdrs, &objp->arg1))
		 return FALSE;
	 if (!xdr_int (xdrs, &objp->arg2))
		 return FALSE;
	return TRUE;
}

bool_t
xdr_entrada_c (XDR *xdrs, entrada_c *objp)
{
	register int32_t *buf;

	 if (!xdr_int (xdrs, &objp->arg1))
		 return FALSE;
	 if (!xdr_char (xdrs, &objp->operador))
		 return FALSE;
	 if (!xdr_int (xdrs, &objp->arg2))
		 return FALSE;
	return TRUE;
}
