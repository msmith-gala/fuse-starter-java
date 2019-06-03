
package org.galatea.starter.service;

import org.galatea.starter.domain.SettlementMission;
import org.galatea.starter.domain.TradeAgreement;

@FunctionalInterface
public interface IAgreementTransformer {

  SettlementMission transform(final TradeAgreement agreement);
}
