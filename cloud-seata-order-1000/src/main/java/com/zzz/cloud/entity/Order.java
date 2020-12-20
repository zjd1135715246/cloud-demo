package com.zzz.cloud.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

  private Long id;
  private String orderNo;
  private Long amount;
  private Long status;
  private Long stockId;
  private Long userId;
  private Date buildTime;


}
