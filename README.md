# Binary indexd tree 
又稱 Fenwick Tree

## 應用
求一個數列, 任一段間隔的的總和.
當數列的某個元素更新, 也可以使用.



## 複雜度


### insert: log(n)

lowbit(i) = x & -x
x = 5 = 0110, -x = 1001 + 1 = 1010, lowbit(x) = 0110 & 1010 = 0010

i += lowbit(i), i <= n
相當於更新 2 的次方節點
### query: log(n)

i -= lowbit(i), i > 0

## 參考
http://zxi.mytechroad.com/blog/sp/fenwick-tree-binary-indexed-tree-sp3/