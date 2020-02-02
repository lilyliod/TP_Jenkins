package com.test;
<<<<<<< HEAD

import static org.junit.Assert.*;

import org.junit.Test;

import com.exception.NoSquareException;
import com.model.Matrix;
import com.service.MatrixMathematics;
=======
import com.example.exception.NoSquareException;
import com.example.model.Matrix;
import com.example.service.MatrixMathematics;
import static org.junit.Assert.*;
import org.junit.Test;


>>>>>>> new/master

public class MatrixMathematicsTest 
{

	@Test
<<<<<<< HEAD
	public final void testTranspose() 
	{
		double [][] data ={{1,2},{3,4},{5,6}};
		double [][] Tdata ={{1,3,5},{2,4,6}};
		Matrix mat=new Matrix(data); 
		
		assertArrayEquals(MatrixMathematics.transpose(mat).getValues(),Tdata);
		
	}

	@Test
	public final void testInverse() 
	{ 
		double [][] data ={{1,2},{3,4}};
		Matrix mat=new Matrix(data); 
		double [][] Idata ={{-2,1},{1.5,-0.5}};
		
		try{
			assertArrayEquals(MatrixMathematics.inverse(mat).getValues(),Idata);
			} catch ( NoSquareException e ){System.out.print("");
			}
		
		
	}

	@Test
	public final void testDeterminantCarre()
	{
		double [][] data ={{1,2},{3,4}};
		Matrix mat=new Matrix(data); 
		double det = -2;
		try{
		assertEquals(MatrixMathematics.determinant(mat),det,0);
		} catch ( NoSquareException e ){System.out.print("la matrice doit etre carr�e");
		}
	}
=======
	public final void testTranspose()
	{
		double [][] data ={{1,2},{3,4},{5,6}};
		double [][] Tdata ={{1,3,5},{2,4,6}};
		Matrix mat=new Matrix(data);

		assertArrayEquals(MatrixMathematics.transpose(mat).getValues(),Tdata);

	}



>>>>>>> new/master

	@Test
	public final void testDeterminant()
	{
		double [][] data ={{1,2,3},{4,5,6},{7,8,9}};
<<<<<<< HEAD
		Matrix mat=new Matrix(data); 
=======
		Matrix mat=new Matrix(data);
>>>>>>> new/master
		double det = 0;
		try{
		assertEquals(MatrixMathematics.determinant(mat),det,0);
		} catch ( NoSquareException e ){System.out.print("la matrice doit etre carr�e");
		}
	}

	

	@Test
	public final void testCofactor() 
	{
      
		double [][] data ={{1,2},{3,4}};
		Matrix mat=new Matrix(data); 
		double [][] Cdata ={{4,-3},{-2,1}};
		
		try{
			assertArrayEquals(MatrixMathematics.cofactor(mat).getValues(),Cdata);
			} catch ( NoSquareException e ){System.out.print("matrice doit etre carr�e");
			}

	}
	
<<<<<<< HEAD
	@Test (expected = NoSquareException.class )
	public final void testException() throws NoSquareException
	{
		double [][] data ={{1,2},{3,4},{5,6}};
		Matrix mat=new Matrix(data); 
		
			Matrix matI=MatrixMathematics.inverse(mat);
			
		
	}
=======

>>>>>>> new/master
	

}
