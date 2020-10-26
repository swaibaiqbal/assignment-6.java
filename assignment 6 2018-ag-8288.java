public class Binarysearch
public static int rank(int key,int[])
{
int lo=0;
int hi=a.lenght-1;
while(lo<=hi)
{
int mid=lo+(hi-lo/2);
if(key<a[mid])hi=mid-1;
else 
if(key>a[mid])lo=mid+1;
else
return mid;
}
return-1;
}
public static void main(string[]args)
{
int[]whitelist=in.readints(args[0]);
Arrays.sort(whitelist);
while(!stdin.isEmpty())
{
int key=stdIN.readIn();
if(rank(key,whitelist)==-1
stdout.println(key);
}
}