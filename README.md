# insert-sort-
insert sort algorithm 插入排序算法

插入排序原理

假如数组A为[5,4,3,2,1]

从j=1开始遍历此时A[j]=4，当前key即为4

内层循环则是从i=j-1开始，即j前面所有的数据

从大向小比较

内层循环第一条数据即为A[i]=A[j-1]=A[0]=5

5是大于4的，所以不用将5后移一位A[i+1]=A[i]，即A[1]=[0]，

下标为一的位置数据变成了5

继续执行i--，此时i=-1，跳出循环

将当前位置的后一位设为key，当前位置的下标为-1，则后一位为0，

则A[0]=key，即A[0]=4，数组变成了[4,5,3,2,1]

以此类推，第二次外层循环4,5后移一位，3插在第一位，数组变成[3,4,5,2,1]

第三次外层循环，2前面的大于2的数据后移一位，2插到前面，数组变成[2,3,4,5,1]

第四次循环则为[1,2,3,4,5]

排序完成
