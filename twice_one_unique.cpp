#include<bits/stdc++.h>
using namespace std;
void printRepeating(int arr[], int size)
{
  int xor = arr[0]; /* Will hold xor of all elements */
  int set_bit_no;  /* Will have only single set bit of xor */
  int i;
  int n = size - 2;
  int x = 0, y = 0;
   
  /* Get the xor of all elements in arr[] and {1, 2 .. n} */
  for(i = 1; i < size; i++)
    xor ^= arr[i];  
  for(i = 1; i <= n; i++)
    xor ^= i;   
 
  /* Get the rightmost set bit in set_bit_no */
  set_bit_no = xor & ~(xor-1);
 
  /* Now divide elements in two sets by comparing rightmost set
   bit of xor with bit at same position in each element. */
  for(i = 0; i < size; i++)
  {
    if(arr[i] & set_bit_no)
      x = x ^ arr[i]; /*XOR of first set in arr[] */
    else
      y = y ^ arr[i]; /*XOR of second set in arr[] */
  }
  for(i = 1; i <= n; i++)
  {
    if(i & set_bit_no)
      x = x ^ i; /*XOR of first set in arr[] and {1, 2, ...n }*/
    else
      y = y ^ i; /*XOR of second set in arr[] and {1, 2, ...n } */
  }
   
  printf("\n The two repeating elements are %d & %d ", x, y);
}     
 
 
int main()
{
  int arr[] = {4, 2, 4, 5, 2, 3, 1};
  int arr_size = sizeof(arr)/sizeof(arr[0]);  
  printRepeating(arr, arr_size);
  getchar();
  return 0;
}
Status API Training Shop Blog About

System-Provided:
{
 "VCAP_SERVICES": {
  "logstash-18": [
   {
    "credentials": {
     "hostname": "10.72.7.26",
     "password": "9rhzp9fsol5pdupz",
     "ports": {
      "514/tcp": "32804",
      "9200/tcp": "32805",
      "9300/tcp": "32806"
     },
     "username": "b7jlmyjfegw6g6it"
    },
    "label": "logstash-18",
    "name": "logstash-service",
    "plan": "free",
    "provider": null,
    "syslog_drain_url": "syslog://10.72.7.26:32804",
    "tags": [
     "logstash14",
     "logstash",
     "syslog"
    ],
    "volume_mounts": []
   }
  ]
 }
}

{
 "VCAP_APPLICATION": {
  "application_id": "61234800-f973-4fbb-a921-b335aadc938a",
  "application_name": "thingsee-app",
  "application_uris": [
   "thingsee-app.run.aws-usw02-pr.ice.predix.io"
  ],
  "application_version": "a734eb67-8145-494a-94c8-57da774b5ed1",
  "limits": {
   "disk": 1024,
   "fds": 16384,
   "mem": 512
  },
  "name": "thingsee-app",
  "space_id": "c13f0fe8-9dc4-4c09-91f0-69aa21cab4c9",
  "space_name": "dev",
  "uris": [
   "thingsee-app.run.aws-usw02-pr.ice.predix.io"
  ],
  "users": null,
  "version": "a734eb67-8145-494a-94c8-57da774b5ed1"
 }
}
