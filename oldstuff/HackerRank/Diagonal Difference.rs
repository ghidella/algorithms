//https://www.hackerrank.com/challenges/diagonal-difference/problem

//Solution without libs
fn diagonalDifference(arr: &[Vec<i32>]) -> i32 {
    let mut left: i32 = 0;
    let mut right: i32 = 0;
    for i in 0..arr.len() as usize{
        left += arr[i][i];  
        right += arr[i][arr.len() - i - 1];
             
    }
    if right > left {
        right - left
    }
    else {
        left - right
    }
}


//using abs
use num::abs;

fn diagonalDifference(arr: &[Vec<i32>]) -> i32 {
    let mut left: i32 = 0;
    let mut right: i32 = 0;
    for i in 0..arr.len() as usize{
        left += arr[i][i];  
        right += arr[i][arr.len() - i - 1];
             
    }
    abs(left - right)
}