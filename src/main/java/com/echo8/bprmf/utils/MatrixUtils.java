package com.echo8.bprmf.utils;

import com.echo8.bprmf.type.FactorMatrix;

public class MatrixUtils {
    public static float rowScalarProductWithRowDifference(
            FactorMatrix userFactorMatrix, Integer userId,
            FactorMatrix itemFactorMatrix, Integer posItemId, Integer negItemId) {
        float result = 0;

        for (int i = 0; i < userFactorMatrix.getNumFactors(); i++) {
            result +=
                userFactorMatrix.getValue(userId, i)
                    * (itemFactorMatrix.getValue(posItemId, i) - itemFactorMatrix
                        .getValue(negItemId, i));
        }

        return result;
    }
}
