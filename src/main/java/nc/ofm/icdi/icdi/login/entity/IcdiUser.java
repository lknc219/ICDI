package nc.ofm.icdi.icdi.login.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
@Setter
public class IcdiUser {

    @Id
    private Long userNumber;
    @Column(length = 30, unique = true)
    private String userId;
    private String userPw;
    private String userNm;
    private String uesYn;
    private Date regDt;
    private String regId;
    private Date udtDt;
    private String udtId;

//     TODO 데이터베이스 설계하기
}
